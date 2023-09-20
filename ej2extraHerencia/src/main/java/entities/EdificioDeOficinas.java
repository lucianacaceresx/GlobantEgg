/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author lu
 */
public class EdificioDeOficinas extends Edificio {
    private int numOficinas;
    private int personasPorOficina;
    private int numPisos;

    public EdificioDeOficinas(int numOficinas, int personasPorOficina, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numPisos = numPisos;
    }

    @Override
    public double calcularSuperficie() {
        // Calcular superficie 
        return 2 * (ancho * largo + alto * largo + alto * ancho) * numPisos;
    }

    @Override
    public double calcularVolumen() {
        // Calculamos  volumen del edificio 
        return ancho * alto * largo * numPisos;
    }

    public int cantPersonas() {
        // Calcular cuántas personas pueden trabajar en todo el edificio
        return numOficinas * personasPorOficina * numPisos;
    }
}

