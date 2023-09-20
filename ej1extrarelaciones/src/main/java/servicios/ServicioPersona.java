/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author lu
 */
public class ServicioPersona {
    Scanner leer = new Scanner(System.in).useDelimiter('\n');
    
    public void crearPersona(){
        Persona persona1 _= new Persona();
        
        System.out.println("Ingrese el nombre de la persona");
        persona1.setNombre(leer.next());
    }
    
    public void fabricarPersona(){
        String respuesta = "";
        
    }
    
}
sout