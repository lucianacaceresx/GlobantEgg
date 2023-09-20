package main.ejextra4relaciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lu
 */

public class Ejextra4relaciones {

    public static void main(String[] args) {
        
        List<String> listado = simulador.generarListadoAlumnos(5);

        System.out.println("Listado de alumnos generados:");
        for (String alumno : listado) {
            System.out.println(alumno);
        }

        // Call the generarDNIs method from Simulador
        ArrayList<Integer> listaDnis = simulador.generarDNIs();
        System.out.println("\nLista de DNIs generados:");
        for (Integer dni : listaDnis) {
            System.out.println(dni);
        }
    }
}

    
      

