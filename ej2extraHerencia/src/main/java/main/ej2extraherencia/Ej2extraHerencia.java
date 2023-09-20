/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.ej2extraherencia;

import entities.Edificio;
import entities.EdificioDeOficinas;
import entities.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author lu
 */
public class Ej2extraHerencia {

  
    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList<>();


        edificios.add(new Polideportivo("Polideportivo 1", "Techado", 50, 30, 20));
        edificios.add(new Polideportivo("Polideportivo 2", "Abierto", 60, 40, 30));

        edificios.add(new EdificioDeOficinas(10, 50, 5, 30, 20, 10));
        edificios.add(new EdificioDeOficinas(15, 40, 8, 35, 25, 12));
 
        
        for (Edificio edificio : edificios) {
            System.out.println("Superficie de " + edificio.getClass().getSimpleName() + ": " + edificio.calcularSuperficie());
            System.out.println("Volumen de " + edificio.getClass().getSimpleName() + ": " + edificio.calcularVolumen());

            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                System.out.println("Tipo de instalación: " + polideportivo.getTipoInstalacion());
            } else if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas edifOficinas = (EdificioDeOficinas) edificio;
                System.out.println("Cantidad de personas en el edificio de oficinas: " + edifOficinas.cantPersonas());
            }

        }
    }
}


