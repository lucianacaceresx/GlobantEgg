/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author lu
 */
public class Estudiante extends Persona{
 
    protected String curso;

    public Estudiante(String nombre, String apellido, String nroIdentificacion, String estadoCivil, String curso) {
        super(nombre, apellido, nroIdentificacion, estadoCivil);
        this.curso = curso;
    }

    public void matricularEnCurso(String nuevoCurso) {
        this.curso = nuevoCurso;
    }
}

