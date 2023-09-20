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
public class Yate extends Barco{

    private int potenciaCV;
    private int numeroCamarotes;


    public Yate() {
    }
    public Yate(String matricula, double eslora, LocalDate anioFabricacion, int potenciaCV, int numeroCamarotes) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }
    public int getPotenciaCV() {
        return potenciaCV;
    }
    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }
    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }


}
// • Potencia en CV y número de camarotes para yates de lujo.

