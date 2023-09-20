/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.manosalaobra_prueba;

import java.util.ArrayList;
import entidad.Animal;
import entidad.Gato;
import entidad.Perro;


/**
 *
 * @author lu
 */
public class Manosalaobra_prueba {

    public static void main(String[] args) {
            
        ArrayList<Animal>listaAnimales = new ArrayList<Animal>();
        
        Animal a = new Animal();
        Perro b = new Perro();
        Gato c = new Gato();
        
        listaAnimales.add(a);
        listaAnimales.add(b);
        listaAnimales.add(c);
        
        for(Animal aux:listaAnimales){
            aux.hacerRuido();
        }
    }
    
}
