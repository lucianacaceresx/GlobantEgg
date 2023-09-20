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

public class Velero extends Barco {
    private int numeroMastiles;

    public Velero() {
    }

    public Velero(String matricula, double eslora, LocalDate anioFabricacion, int numeroMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    




}
// • Número de mástiles para veleros.

