import java.util.*;
public class SistemaTicketing {
    private List <Incidencia> listaIncidencias;
    private List<Tecnico> listaTecnicos;
    private Reporte reporte;

    public SistemaTicketing() {
        this.listaIncidencias = new ArrayList<>();
        this.listaTecnicos = new ArrayList<>();
        this.reporte = reporte;
        cargarTecnicosIniciales();
    }
    private void cargarTecnicosIniciales(){
        listaTecnicos.add(new Tecnico("T01", "Eduardo Lopez", "Tecnico", "HARDWARE"));
        listaTecnicos.add(new Tecnico("T02", "Maria Torres", "Tecnico", "SOFTWARE"));
        listaTecnicos.add(new Tecnico("T03", "Ingrid Sanchez", "Tecnico", "RED"));

    }
    public void RegistrarIncidencia(Incidencia nuevaIncidencia){
       listaIncidencias.add(nuevaIncidencia);
    }
    public void filtrarPorTipo(TipoIncidencia tipo){
        System.out.println("====FILTRO POR TIPO: "+tipo+"=====");
        for(Incidencia i : listaIncidencias){
            if(i.getTipoIncidencia()==tipo){
                System.out.println(i);
            }
        }
    }
    public void filtrarPorEstado(EstadoIncidencia estado){
        System.out.println("====FILTRO POR ESTADO: "+ estado + "====");
        for(Incidencia i : listaIncidencias){
            if(i.getEstado()==estado){
                System.out.println(i);
            }
        }
    }
    public void filtrarPorPrioridad(Prioridad prioridad){
        System.out.println("====FILTRO POR PRIORIDAD: "+prioridad+"=====");
        for(Incidencia i: listaIncidencias){
            if(i.getPrioridad()== prioridad){
                System.out.println(i);
            }
        }
    }
    public void AsginarTecnico(Incidencia incidencia){
        for(Tecnico t: listaTecnicos){
            if(t.getEspecialidad().equalsIgnoreCase(incidencia.getTipoIncidencia().toString())){
                incidencia.setTecnicoAsignado(t);
                System.out.println("Tecnico asignado: "+t.getNombre());
            }
        }
    }
    public void CambiarEstado(String folio, EstadoIncidencia nuevoEstado){
        for(Incidencia i: listaIncidencias){
            if(i.getFolio().equals(folio)){
                i.setEstado(nuevoEstado);
                System.out.println("Estado actualizado a: "+ nuevoEstado);
            }
        }
        System.out.println("No fue encontrada esa incidencia.");
    }
    public void GenerarReporte(){
        reporte.generarPorEstado(listaIncidencias);
    }
}
