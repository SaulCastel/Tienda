/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Saul
 */
public class Nodo<tipo> {
    private tipo dato;
    private Nodo<tipo> puntero;
    private String prioridad;
    
    public Nodo (tipo dato){
        this.dato = dato;
        puntero = null;
    }
    
   public Nodo (tipo dato, boolean prioridad){
       this.dato = dato;
       puntero = null;
       this.prioridad = (prioridad)? "Alta" : "Baja";
   }
    
    public Nodo<tipo> siguiente (){return puntero;}
    
    public tipo contenido (){return dato;}
    
    public void apuntar (Nodo<tipo> puntero){
        this.puntero = puntero;
    }
    
    public String prioridad (){
        return prioridad;
    }
}
