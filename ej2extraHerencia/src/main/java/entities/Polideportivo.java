/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author lu
 */
public class Polideportivo extends Edificio {
    private String nombre;
    private String tipoInstalacion;

    public Polideportivo(String nombre, String tipoInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public double calcularSuperficie() {
        // aca calcula superficie
        return 2 * (ancho * largo + alto * largo + alto * ancho);
    }

    @Override
    public double calcularVolumen() {
       //volumen
        return ancho * alto * largo;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }
}

