import java.util.List;
public class Reporte {
    public void generarPorTipo(List<Incidencia> lista){
        System.out.println("====Reporte por tipo=====");
        int h=0, s=0, r=0;
        for(Incidencia i: lista){
            if(i.getTipoIncidencia()== TipoIncidencia.HARDWARE){
                h++;
            } else if(i.getTipoIncidencia()== TipoIncidencia.SOFTWARE){
                s++;
            } else if(i.getTipoIncidencia()== TipoIncidencia.RED){
                r++;
            }
        }
        System.out.println("Hardware: " + h);
        System.out.println("Software: "+ s);
        System.out.println("Red: "+ r);

    }
    public void generarPorPrioridad(List<Incidencia> lista){
        System.out.println("====Reporte por priorirdad====");
        int bajas=0, medias=0, altas=0;
        for(Incidencia i:lista){
            if(i.getPrioridad()== Prioridad.BAJA){
                bajas++;
            } else if(i.getPrioridad()== Prioridad.MEDIA){
                medias++;
            } else if(i.getPrioridad() == Prioridad.ALTA){
                altas++;
            }
        }
        System.out.println("Bajas: "+ bajas);
        System.out.println("Medias: "+ medias);
        System.out.println("Altas: "+ altas);
    }
    public void generarPorEstado(List<Incidencia>lista){
        System.out.println("=====Reporte por estado=====");
        int nuevos=0, progresos=0, pendientes=0, resueltos=0, cerrados=0;
        for(Incidencia i : lista){
            if(i.getEstado()== EstadoIncidencia.NUEVO){
                nuevos++;
            } else if(i.getEstado()== EstadoIncidencia.EN_PROGRESO){
                progresos++;
            } else if(i.getEstado()== EstadoIncidencia.PENDIENTE){
                pendientes++;
            } else if(i.getEstado()== EstadoIncidencia.RESUELTO){
                resueltos++;
            } else if(i.getEstado()== EstadoIncidencia.CERRADO){
                cerrados++;
            }
        }
        System.out.println("Nuevos: "+ nuevos);
        System.out.println("En progreso: "+ progresos);
        System.out.println("Pendientes: "+ pendientes);
        System.out.println("Resueltos: "+ resueltos);
        System.out.println("Cerrados: "+ cerrados);
    }
}
