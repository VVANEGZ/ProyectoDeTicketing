import java.util.*;
public class Main {
    public static void main(String[] args) {
        SistemaTicketing sistema= new SistemaTicketing();
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        sistema.RegistrarIncidencia(new Incidencia("INC001", "Teclado no funciona", new Date(), "PC-12", TipoIncidencia.HARDWARE, Prioridad.ALTA, EstadoIncidencia.NUEVO));
        do{
            System.out.println("\n--- TICKETING LAB-LIS ---");
            System.out.println("1. Registrar Incidencia (Usuario)");
            System.out.println("2. Ver Incidencias por Estado (Técnico)");
            System.out.println("3. Cambiar Estado de Ticket (Técnico)");
            System.out.println("4. Generar Reporte (Admin)");
            System.out.println("5. Salir");
            System.out.print("Seleccione opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Folio: ");
                    String folio = teclado.nextLine();
                    System.out.print("Descripcion: ");
                    String desc = teclado.nextLine();

                    // Selección simple de tipo
                    System.out.println("Tipo (1.HARDWARE, 2.SOFTWARE, 3.RED): ");
                    int tipoOp = teclado.nextInt();
                    TipoIncidencia tipo = (tipoOp == 1) ? TipoIncidencia.HARDWARE :
                            (tipoOp == 2) ? TipoIncidencia.SOFTWARE : TipoIncidencia.RED;

                    Incidencia nueva = new Incidencia("INC001", "Teclado no funciona", new Date(), "PC-12", TipoIncidencia.HARDWARE, Prioridad.ALTA, EstadoIncidencia.NUEVO);
                    sistema.RegistrarIncidencia(nueva);
                    break;

                case 2:
                    System.out.println("Ver estado (1.NUEVO, 2.RESUELTO): "); // Simplificado para el ejemplo
                    int estOp = teclado.nextInt();
                    EstadoIncidencia est = (estOp == 1) ? EstadoIncidencia.NUEVO : EstadoIncidencia.RESUELTO;
                    sistema.filtrarPorEstado(est);
                    break;

                case 3:
                    System.out.print("Ingrese Folio a actualizar: ");
                    String f = teclado.nextLine();
                    sistema.CambiarEstado(f, EstadoIncidencia.RESUELTO); // Ejemplo directo a Resuelto
                    break;

                case 4:
                    sistema.GenerarReporte();
                    break;
            }
        } while (opcion !=5);
    }
}

