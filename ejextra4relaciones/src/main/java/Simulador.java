import java.util.ArrayList;
import static java.util.Collections.shuffle;
import java.util.List;
import java.util.Random;

public class Simulador {
    private static final String[] NOMBRES = {"Male", "Chiara", "Marian", "Daiana", "Lu" };
    private static final String[] APELLIDOS = {"Martínez", "Pérez", "Fernández", "Caceres"};

    public List<String> generarListadoAlumnos(int cantidad) {
        List<String> listadoAlumnos = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            String nombreAleatorio = NOMBRES[random.nextInt(NOMBRES.length)];
            String apellidoAleatorio = APELLIDOS[random.nextInt(APELLIDOS.length)];
            String alumno = nombreAleatorio + " " + apellidoAleatorio;
            listadoAlumnos.add(alumno);
        }

        return listadoAlumnos;
    }
    
    public ArrayList<Integer> generarDNIs() {
        ArrayList<Integer> listaDnis = new ArrayList();
        int dni;
        int cantidadDnis = 5; 

        for (int i = 0; i < cantidadDnis; i++) {
            dni = (int) (Math.random() * 99999999 + 1);
            listaDnis.add(dni);
        }

        shuffle(listaDnis);
        return listaDnis;
    }
}

    
    




        