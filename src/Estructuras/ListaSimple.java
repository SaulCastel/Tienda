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
public class ListaSimple<tipo> {
    private Nodo<tipo> inicio;
    private int elementos;
    
    public ListaSimple(){
        inicio = null;
        elementos = 0;
    }
    
    public int cantidad (){return elementos;}
    
    public void nuevo (tipo dato){
        if (inicio == null){
            inicio = new Nodo<tipo>(dato);
        }
        else{
            Nodo<tipo> temporal = inicio;
            inicio = new Nodo<tipo>(dato);
            inicio.apuntar(temporal);
        }
        elementos++;
    }
    public Nodo<tipo> cabeza (){
        return inicio;
    }
    
}
