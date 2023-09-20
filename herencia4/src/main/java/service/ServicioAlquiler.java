/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import main.herencia4.Alquiler;
import main.herencia4.Motoren;
import main.herencia4.Velero;
import main.herencia4.Yate;

/**
 *
 * @author lu
 */
public class ServicioAlquiler extends Alquiler{
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
