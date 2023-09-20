/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.ej4extraherencia;

//  luego de importar el paquete poner "." y luego "*" asi importa todas las clases juntas.
import entidades.*;


/**
 *
 * @author lu
 */
public class Ej4extraHerencia {

    public static void main(String[] args) {
         Estudiante E = new Estudiante("David", "Toro", "1234", "Soltero", "Backend");
        
        Profesor P = new Profesor("Luis", "Kunz", "5678", "Casado", "QA");
        
        PersonalServicio PS = new PersonalServicio("Leslie", "Petrelli", "6839", "Casada", "Profesorado de Lengua");
        
        E.matricularEnCurso("Arte");
        P.cambiarDepartamento("Ciencias");
        PS.trasladarSeccion("Biblioteca");
        E.cambiarEstadoCivil("Casado");
        P.añoIncorporacion(1998);
        PS.despacho(240);
        
       
        System.out.println("Info del estudiante:" + E.toString());
        System.out.println("Info del Profe: " + P.toString());
        System.out.println("Info del personal de servicio: " + PS.toString());
        
        


     
    }
}
