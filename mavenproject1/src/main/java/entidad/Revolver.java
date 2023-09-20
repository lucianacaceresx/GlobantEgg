/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author lu
 */
public class Revolver {
    private int posicionActual;
    private int posicionAgua;

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    
    public void toStringNew() {
        System.out.println("Posicion de Tambor: " + this.posicionActual);
        System.out.println("Posicion Agua: " + this.posicionAgua);
    }
//    ------------------------------------------------
    public void llenarRevolver(){
        double posicion = Math.random()*10;
        Math.round(posicion);
        
        if (posicion > 0  && posicion <11){
            this.posicionActual = (int) posicion;
        }else {
            llenarRevolver();
        }
        
         double posicionAgua = Math.random()*10;
        Math.round(posicionAgua);
        
        if (posicion > 0  && posicion <11){
            this.posicionActual = (int) posicion;
        }else {
            llenarRevolver();
        }
    }
    
    public boolean mojar(Revolver revolver){
        return(this.posicionActual == this.posicionAgua);
    }
    
    public void siguienteChorro(){
        if(this.posicionActual == 10){
            this.posicionActual = 1 ;
        }else {
            this.posicionActual = this.posicionActual + 1;
        }
        
    }
}
