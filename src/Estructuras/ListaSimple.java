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

    public ListaSimple() {
        inicio = null;
        elementos = 0;
    }

    public int cantidad() {
        return elementos;
    }

    public void nuevo(tipo dato) {
        if (inicio == null) {
            inicio = new Nodo<tipo>(dato);
        } else {
            Nodo<tipo> temporal = inicio;
            inicio = new Nodo<tipo>(dato);
            inicio.apuntar(temporal);
        }
        elementos++;
    }

    public void nuevo(Nodo<tipo> dato) {
        if (inicio == null) {
            inicio = dato;
        } else {
            Nodo<tipo> temporal = inicio;
            inicio = dato;
            inicio.apuntar(temporal);
        }
        elementos++;
    }

    public Nodo<tipo> cabeza() {
        return inicio;
    }

    public void modificar(tipo viejo, tipo mod) {
        if (elementos == 1) {
            Nodo<tipo> nuevo = new Nodo<tipo>(mod);
            inicio = nuevo;
        }
        else if(viejo == inicio.contenido()){
            Nodo<tipo> tmp = inicio;
            inicio = new Nodo<tipo>(mod);
            inicio.apuntar(tmp.siguiente());
        }
        else {
            Nodo<tipo> iterador = inicio;
            while (iterador.siguiente().contenido() != viejo) {
                iterador = iterador.siguiente();
            }
            Nodo<tipo> nuevo = new Nodo<tipo>(mod);
            nuevo.apuntar(iterador.siguiente().siguiente());
            iterador.apuntar(nuevo);
        }
    }

    public void elimf() {
        Nodo<tipo> iterador = inicio;
        while (iterador.siguiente().siguiente() == null) {
            iterador = iterador.siguiente();
        }
        iterador.apuntar(null);
        elementos--;
    }
}
