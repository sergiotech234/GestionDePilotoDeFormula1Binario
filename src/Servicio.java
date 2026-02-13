import java.util.List;
import java.util.Scanner;
public class Servicio {

        private List<Piloto> pilotos;
        Scanner sc = new Scanner(System.in);

        public Servicio(List<Piloto> pilotos) {
            this.pilotos = pilotos;
        }

        public void mostrarPilotos() {
            if (pilotos.isEmpty()) {
                System.out.println("Lista vacia");
                return;
            }
            for (Piloto piloto : pilotos) {
                System.out.println(piloto);
            }
        }

        public void añadirPiloto(){
            System.out.println("Escriba el nombre del piloto");
            String nombre = sc.nextLine();

            for (Piloto p : pilotos){
                if (p.getNombre().equalsIgnoreCase(nombre)){
                    System.out.println("El piloto ya existe");
                    return;
                }
            }

            System.out.println("Escuderia: ");
            String escuderia = sc.nextLine();

            System.out.println("Puntos: ");
            int puntos = sc.nextInt();
            sc.nextLine();

            pilotos.add(new  Piloto(nombre, escuderia, puntos));

            System.out.println("Piloto creado");
        }

        public void buscarPiloto(){
            System.out.println("Escriba el nombre del piloto");
            String nombre = sc.nextLine();

            for (Piloto p : pilotos){
                if (p.getNombre().equalsIgnoreCase(nombre)){
                    System.out.println("Encontrado");
                    System.out.println(p);
                    return;
                }
            }
            System.out.println("Piloto no encontrado");
        }
    }

