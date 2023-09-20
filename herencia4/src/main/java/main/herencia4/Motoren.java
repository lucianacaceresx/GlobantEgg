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

public class Motoren extends Barco {
    private int potenciaCV;

    public Motoren() {
    }

    public Motoren(String matricula, double eslora, LocalDate anioFabricacion, int potenciaCV) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    
    
}
