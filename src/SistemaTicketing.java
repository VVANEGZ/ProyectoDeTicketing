import java.util.*;

public class SistemaTicketing {

    private List<Incidencia> listaIncidencias;
    private List<Tecnico> listaTecnicos;
    private Reporte reporte;

    public SistemaTicketing() {
        this.listaIncidencias = new ArrayList<>();
        this.listaTecnicos = new ArrayList<>();
        this.reporte = new Reporte();
        cargarTecnicosIniciales();
    }

    private void cargarTecnicosIniciales() {
        listaTecnicos.add(new Tecnico("T01", "Eduardo Lopez", "Tecnico", "HARDWARE"));
        listaTecnicos.add(new Tecnico("T02", "Maria Torres", "Tecnico", "SOFTWARE"));
        listaTecnicos.add(new Tecnico("T03", "Ingrid Sanchez", "Tecnico", "RED"));
    }

    public void agregarTecnico(Tecnico t) {
        listaTecnicos.add(t);
    }

    public void RegistrarIncidencia(Incidencia nuevaIncidencia) {
        listaIncidencias.add(nuevaIncidencia);
        System.out.println("\nIncidencia registrada correctamente.");
    }

    public void AsignarTecnico(Incidencia incidencia) {
        for (Tecnico t : listaTecnicos) {
            // ejemplo: HARDWARE == HARDWARE
            if (t.getEspecialidad().equalsIgnoreCase(incidencia.getTipoIncidencia().toString())) {

                incidencia.setTecnicoAsignado(t);
                System.out.println("Técnico asignado: " + t.getNombre());

                break;
            }
        }
    }

    public void CambiarEstado(String folio, EstadoIncidencia nuevoEstado) {
        for (Incidencia i : listaIncidencias) {
            if (i.getFolio().equals(folio)) {
                i.setEstado(nuevoEstado);
                System.out.println("Estado actualizado a: " + nuevoEstado);
                return;
            }
        }
        System.out.println("No fue encontrada esa incidencia.");
    }

    public void filtrarPorTipo(TipoIncidencia tipo) {
        System.out.println("==== FILTRO POR TIPO: " + tipo + " ====");
        for (Incidencia i : listaIncidencias) {
            if (i.getTipoIncidencia() == tipo) {
                System.out.println(i);
            }
        }
    }

    public void filtrarPorEstado(EstadoIncidencia estado) {
        System.out.println("==== FILTRO POR ESTADO: " + estado + " ====");
        for (Incidencia i : listaIncidencias) {
            if (i.getEstado() == estado) {
                System.out.println(i);
            }
        }
    }

    public void filtrarPorPrioridad(Prioridad prioridad) {
        System.out.println("==== FILTRO POR PRIORIDAD: " + prioridad + " ====");
        for (Incidencia i : listaIncidencias) {
            if (i.getPrioridad() == prioridad) {
                System.out.println(i);
            }
        }
    }

    public void filtrarPorTecnico(String nombreTecnico) {
        System.out.println("==== FILTRO POR TÉCNICO: " + nombreTecnico + " ====");
        for (Incidencia i : listaIncidencias) {
            if (i.getTecnicoAsignado() != null &&
                    i.getTecnicoAsignado().getNombre().equalsIgnoreCase(nombreTecnico)) {
                System.out.println(i);
            }
        }
    }
    public String generarFolio() {
        return "INC" + String.format("%03d", listaIncidencias.size() + 1);
    }

    public void GenerarReporte() {
        System.out.println("\n===== REPORTE GENERAL DEL LABORATORIO =====");
        reporte.generarPorEstado(listaIncidencias);
        reporte.generarPorPrioridad(listaIncidencias);
        reporte.generarPorTipo(listaIncidencias);
        System.out.println("Total de incidencias: " + listaIncidencias.size());
    }
}

