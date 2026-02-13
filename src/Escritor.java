import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Escritor {
    public void guardarPiloto(List<Piloto> alumnos, String archivo) throws Exception {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(alumnos);
        }
    }
}
