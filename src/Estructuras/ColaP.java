/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author saul
 */
public class ColaP<tipo> extends ListaSimple<tipo> {
    
    private Cola<tipo> baja;
    private Cola<tipo> alta;
    
    public ColaP (){
        super();
        baja = new Cola<tipo>();
        alta = new Cola<tipo>();
    }
    
    public void encolar (Nodo<tipo> dato){
        if (dato.prioridad().equals("Alta")){
            alta.encolar(dato);
        }
        else {
            baja.encolar(dato);
        }
    }
    
    public void desencolar (){
        if (alta.cantidad() > 0 ){
            alta.desencolar();
        }
        else {
            baja.desencolar();
        }
    }
}
