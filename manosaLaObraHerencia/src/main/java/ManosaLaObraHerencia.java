

import entidad.Animal;
import entidad.Gato;
import entidad.Perro;
import java.util.ArrayList;

/**
 *
 * @author lu
 */
public class ManosaLaObraHerencia {

    public static void main(String[] args) {
        ArrayList<Animal>listaAnimales = new ArrayList<Animal>();
        
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        
        listaAnimales.add(a);
        listaAnimales.add(b);
        listaAnimales.add(c);
        
        for(Animal aux:listaAnimales){
            aux.hacerRuido();
        }
    }
}
