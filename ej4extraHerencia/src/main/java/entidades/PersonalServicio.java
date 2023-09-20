/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author lu
 */
public class PersonalServicio extends Persona implements Empleado{
      protected String seccion;

    public PersonalServicio(String nombre, String apellido, String nroIdentificacion, String estadoCivil, String seccion) {
        super(nombre, apellido, nroIdentificacion, estadoCivil);
        this.seccion = seccion;
    }

    public void trasladarSeccion(String nuevaSeccion) {
        this.seccion = nuevaSeccion;
    }

    @Override
    public void despacho(int nuevoDespacho) {
    }

    @Override
    public int añoIncorporacion(int par) {
        return 0;
    }
    
    
    
    
}
