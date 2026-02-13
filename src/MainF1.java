import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MainF1 {
    public static void main(String[] args) {
        List<Piloto> lista = new ArrayList<>();
        String archivo = "pilotos_f1.dat";
        Scanner sc = new Scanner (System.in);

        Escritor escritor = new Escritor();
        Lector lector = new Lector();
        Servicio servicios = new Servicio(lista);

        int opcion;

        do {
            System.out.println("GESTION F1");
            System.out.println("1. Cargar piloto");
            System.out.println("2. Mostrar Piloto");
            System.out.println("3. Añadir Piloto");
            System.out.println("4. Buscar Piloto");
            System.out.println("5. Guardar Piloto");
            System.out.println("6. Salir");
            System.out.println("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    try {
                        Lector.cargarPilotos(archivo);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                case 2:
                    servicios.mostrarPilotos();
                    break;
                case 3:
                    servicios.añadirPiloto();
                    break;
                case 4:
                    servicios.buscarPiloto();
                    break;
                case 5:
                    try{
                        escritor.guardarPiloto(lista,archivo);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Elige otra opcion");
                    break;
            }
        }while (opcion != 6);
    }
        }