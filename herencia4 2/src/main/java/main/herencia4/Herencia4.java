/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.herencia4;

import java.time.LocalDate;
import service.ServicioAlquiler;

/**
 *
 * @author lu
 */
public class Herencia4 {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
//        Alquiler alquiler = new Alquiler()
        ServicioAlquiler alquiler = new ServicioAlquiler();
        alquiler.setNombre("Juan");
        alquiler.setDocumento("12345678A");
        alquiler.setFechaAlquiler(LocalDate.of(2021, 1, 1));
        alquiler.setFechaDevolucion(LocalDate.of(2021, 1, 10));
        alquiler.setPosicionAmarre(1);
        alquiler.setBarco(new Velero("1234", 10, LocalDate.of(2020, 1, 1), 2));
        System.out.println(alquiler.costoAlquiler());
        
//        Alquiler alquiler2 = new Alquiler();
        ServicioAlquiler alquiler2 = new ServicioAlquiler();
        alquiler2.setNombre("Juan");
        alquiler2.setDocumento("12345678A");
        alquiler2.setFechaAlquiler(LocalDate.of(2021, 1, 1));
        alquiler2.setFechaDevolucion(LocalDate.of(2021, 1, 10));
        alquiler2.setPosicionAmarre(1);
        alquiler2.setBarco(new Yate("1234", 10, LocalDate.of(2020, 1, 1), 2, 3));
        System.out.println(alquiler2.costoAlquiler());

//        Alquiler alquiler3 = new Alquiler();
        ServicioAlquiler alquiler3 = new ServicioAlquiler();
        alquiler3.setNombre("Juan");
        alquiler3.setDocumento("12345678A");
        alquiler3.setFechaAlquiler(LocalDate.of(2021, 1, 1));
        alquiler3.setFechaDevolucion(LocalDate.of(2021, 1, 10));
        alquiler3.setPosicionAmarre(1);
        alquiler3.setBarco(new Motoren("1234", 10, LocalDate.of(2020, 1, 1), 2));
        System.out.println(alquiler3.costoAlquiler());

//        Alquiler alquiler4 = new Alquiler();
        ServicioAlquiler alquiler4 = new ServicioAlquiler();
        alquiler4.setNombre("Juan");
        alquiler4.setDocumento("12345678A");
        alquiler4.setFechaAlquiler(LocalDate.of(2021, 1, 1));
        alquiler4.setFechaDevolucion(LocalDate.of(2021, 1, 10));
        alquiler4.setPosicionAmarre(1);
        alquiler4.setBarco(new Barco("1234", 10, LocalDate.of(2020, 1, 1)));
        System.out.println(alquiler4.costoAlquiler());
    }
}
    

// /
// Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
// alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
// multiplicando por 10 los metros de eslora).





// Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
// métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
// precio final de su alquiler.
