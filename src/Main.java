import java.util.*;

public class Main {
    public static void main(String[] args) {

        SistemaTicketing sistema = new SistemaTicketing();
        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n===== SISTEMA TICKETING LAB-LIS =====");
            System.out.println("1. Registrar incidencia (Estudiante/Académico)");
            System.out.println("2. Filtrar incidencias (Técnico)");
            System.out.println("3. Cambiar estado (Técnico)");
            System.out.println("4. Generar reporte");
            System.out.println("5. Salir");
            System.out.print("Seleccione: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1 -> registrarIncidencia(sistema, teclado);
                case 2 -> filtrarIncidencias(sistema, teclado);
                case 3 -> cambiarEstado(sistema, teclado);
                case 4 -> sistema.GenerarReporte();
            }

        } while (opcion != 5);

        System.out.println("Saliendo del sistema...");
    }

    private static void registrarIncidencia(SistemaTicketing sistema, Scanner teclado) {

        System.out.println("\n--- REGISTRO DE INCIDENCIA ---");

        String folio = sistema.generarFolio();

        System.out.print("Descripción: ");
        String descripcion = teclado.nextLine();

        System.out.print("Equipo afectado (PC-XX): ");
        String equipo = teclado.nextLine();

        System.out.println("Tipo: 1.HARDWARE  2.SOFTWARE  3.RED");
        int t = teclado.nextInt();
        teclado.nextLine();

        TipoIncidencia tipo = (t == 1) ? TipoIncidencia.HARDWARE :
                (t == 2) ? TipoIncidencia.SOFTWARE :
                        TipoIncidencia.RED;

        System.out.println("Prioridad: 1.Baja 2.Media 3.Alta");
        int p = teclado.nextInt();
        teclado.nextLine();

        Prioridad prioridad = (p == 1) ? Prioridad.BAJA :
                (p == 2) ? Prioridad.MEDIA :
                        Prioridad.ALTA;

        Incidencia nueva = new Incidencia(folio, descripcion, new Date(), equipo, tipo, prioridad, EstadoIncidencia.NUEVO);

        sistema.RegistrarIncidencia(nueva);
        sistema.AsignarTecnico(nueva);

        System.out.println("Incidencia registrada con folio: " + folio);
    }

    private static void filtrarIncidencias(SistemaTicketing sistema, Scanner teclado) {

        System.out.println("\n--- FILTRAR INCIDENCIAS ---");
        System.out.println("1. Por tipo");
        System.out.println("2. Por prioridad");
        System.out.println("3. Por estado");
        System.out.print("Seleccione: ");
        int op = teclado.nextInt();
        teclado.nextLine();

        switch (op) {
            case 1 -> {
                System.out.println("Tipo: 1.HARDWARE 2.SOFTWARE 3.RED");
                int t = teclado.nextInt();
                teclado.nextLine();
                sistema.filtrarPorTipo(
                        t == 1 ? TipoIncidencia.HARDWARE :
                                t == 2 ? TipoIncidencia.SOFTWARE :
                                        TipoIncidencia.RED
                );
            }

            case 2 -> {
                System.out.println("Prioridad: 1.Baja 2.Media 3.Alta");
                int p = teclado.nextInt();
                teclado.nextLine();
                sistema.filtrarPorPrioridad(
                        p == 1 ? Prioridad.BAJA :
                                p == 2 ? Prioridad.MEDIA :
                                        Prioridad.ALTA
                );
            }

            case 3 -> {
                System.out.println("Estado: 1.Nuevo 2.En Progreso 3.Pendiente 4.Resuelto 5.Cerrado");
                int e = teclado.nextInt();
                teclado.nextLine();
                sistema.filtrarPorEstado(
                        e == 1 ? EstadoIncidencia.NUEVO :
                                e == 2 ? EstadoIncidencia.EN_PROGRESO :
                                        e == 3 ? EstadoIncidencia.PENDIENTE :
                                                e == 4 ? EstadoIncidencia.RESUELTO :
                                                        EstadoIncidencia.CERRADO
                );
            }
        }
    }

    private static void cambiarEstado(SistemaTicketing sistema, Scanner teclado) {
        System.out.println("\n--- CAMBIAR ESTADO ---");
        System.out.print("Ingrese el folio: ");
        String folio = teclado.nextLine();

        System.out.println("Nuevo estado:");
        System.out.println("1. En Progreso");
        System.out.println("2. Pendiente");
        System.out.println("3. Resuelto");
        System.out.println("4. Cerrado");
        int e = teclado.nextInt();
        teclado.nextLine();

        EstadoIncidencia est = switch (e) {
            case 1 -> EstadoIncidencia.EN_PROGRESO;
            case 2 -> EstadoIncidencia.PENDIENTE;
            case 3 -> EstadoIncidencia.RESUELTO;
            default -> EstadoIncidencia.CERRADO;
        };

        sistema.CambiarEstado(folio, est);
    }
}

