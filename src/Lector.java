import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Lector {
    public static ArrayList<Piloto> cargarPilotos(String archivo) throws Exception {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<Piloto>) ois.readObject();
        }
    }
}
