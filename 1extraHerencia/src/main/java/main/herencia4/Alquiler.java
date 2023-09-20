/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.herencia4;

import java.time.LocalDate;

/**
 *
 * @author lu
 */

public class Alquiler {
    private String nombre;
    private String documento;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, String documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion,
            int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    // Un alquiler se calcula multiplicando el número de días de ocupación
    // (calculado con la fecha de
    // alquiler y devolución), por un valor módulo de cada barco (obtenido
    // simplemente
    // multiplicando por 10 los metros de eslora).

    // En los barcos de tipo especial el módulo de cada barco se calcula sacando el
    // módulo normal y
    // sumándole el atributo particular de cada barco. En los veleros se suma el
    // número de mástiles,
    // en los barcos a motor se le suma la potencia en CV y en los yates se suma la
    // potencia en CV y
    // el número de camarotes.

    public double costoAlquiler() {
        int diasOcupacion = (int) (this.fechaDevolucion.toEpochDay() - this.fechaAlquiler.toEpochDay());
        double modulo = this.barco.getEslora() * 10;
        if (this.barco instanceof Velero) {
            System.out.println("Es un Velero");
            modulo += ((Velero) this.barco).getNumeroMastiles();
        } else if (this.barco instanceof Yate) {
            System.out.println("Es un Yate");
            modulo += ((Yate) this.barco).getPotenciaCV() + ((Yate) this.barco).getNumeroCamarotes();
        } else if (this.barco instanceof Motoren) {
            System.out.println("Es un Barco a Motor");
            modulo += ((Motoren) this.barco).getPotenciaCV();
        } else {
            System.out.println("Es un Barco");
        }
        return diasOcupacion * modulo;
    }

    @Override
    public String toString() {
        return "Alquiler [barco=" + barco + ", documento=" + documento + ", fechaAlquiler=" + fechaAlquiler
                + ", fechaDevolucion=" + fechaDevolucion + ", nombre=" + nombre + ", posicionAmarre=" + posicionAmarre
                + "]";
    }

   

}

// En un puerto se alquilan amarres para barcos de distinto tipo.
// Para cada Alquiler se guarda: el
// nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la
// posición del
// amarre y el barco que lo ocupará.

