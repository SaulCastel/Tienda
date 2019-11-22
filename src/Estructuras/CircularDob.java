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
public class CircularDob<tipo> {

    private Nodo<tipo> cabeza;
    private int elementos;

    public CircularDob() {
        cabeza = null;
        elementos = 0;
    }

    public void nuevo(tipo dato) {
        if (elementos == 0) {
            cabeza = new Nodo<tipo>(dato);
            cabeza.apuntar(cabeza);
            cabeza.apuntarA(cabeza);
            elementos++;
        } else if (elementos == 1) {
            Nodo<tipo> nuevo = new Nodo(dato);
            cabeza.apuntarA(nuevo);
            cabeza.apuntar(nuevo);
            nuevo.apuntarA(cabeza);
            nuevo.apuntar(cabeza);
            elementos++;
        } else {
            Nodo<tipo> alFinal = cabeza.anterior();
            Nodo<tipo> nuevo = new Nodo(dato);
            alFinal.apuntar(nuevo);
            nuevo.apuntarA(alFinal);
            nuevo.apuntar(cabeza);
            cabeza.apuntarA(nuevo);
            elementos++;
        }
    }

    public void DeleteIndex(int index) {
        if (elementos == 1) {
            cabeza = null;
            elementos = 0;
        } else if (index == 1) {
            Nodo<tipo> tmp = cabeza;
            cabeza = cabeza.siguiente();
            cabeza.apuntarA(tmp.anterior());
            tmp.anterior().apuntar(cabeza);
            elementos--;

        } else {
            int contador = 1;
            Nodo<tipo> iterador = cabeza;
            while (contador < index) {
                iterador = iterador.siguiente();
                contador++;
            }
            iterador.anterior().apuntar(iterador.siguiente());
            iterador.siguiente().apuntarA(iterador.anterior());
            iterador.apuntar(null);
            iterador.apuntarA(null);
            elementos--;
        }
    }

    public Nodo<tipo> cabeza() {
        return cabeza;
    }
            
    public int cantidad (){return elementos;}
}
