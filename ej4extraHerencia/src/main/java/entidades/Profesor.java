/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author lu
 */
public class Profesor extends Persona implements Empleado{ 
     protected String departamento;
     

    public Profesor(String nombre, String apellido, String nroIdentificacion, String estadoCivil, String departamento) {
        super(nombre, apellido, nroIdentificacion, estadoCivil);
        this.departamento = departamento;
    }

    public void cambiarDepartamento(String nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
    }

    @Override
    public void despacho(int nuevoDespacho) {
       Empleado.despacho = nuevoDespacho;
    }

    @Override
    public int añoIncorporacion(int par) {
        return 0;
    }

    @Override
    public String toString() {
        return "Profesor{"+ super.toString() + "departamento=" + departamento + '}' ;
    }
    
    
    
    
    
}
