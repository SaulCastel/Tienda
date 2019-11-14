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
public class Cola<tipo> extends ListaSimple<tipo> {
    
    public Cola(){
        super();
    }
    
    public void encolar(Nodo<tipo> dato){
        super.nuevo(dato);
    }
    
    public void desencolar (){
        super.elimf();
    }
}
