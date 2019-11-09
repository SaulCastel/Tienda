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
public class CircularSimp<tipo> {
    private Nodo<tipo> inicio;
    private int elementos;
    
    public CircularSimp(){
        inicio = null;
        elementos = 0;
    }
    
    public tipo indice (int indice){
        if (elementos == 1 || indice == 1){
            return inicio.contenido();
        }
        else{
            Nodo<tipo> iterador = inicio;
            tipo elemento = null;
            int contador = 1;
            while(contador < indice){
                iterador = iterador.siguiente();
                contador++;
            }
            elemento = iterador.contenido();
            return elemento;
        }
    }
    
    public tipo pasar (int indice){
        tipo elemento = null;
        if (elementos == 1){
            elemento = inicio.contenido();
            reiniciar();
        }
        else if (indice == 1 && elementos != 1){
            Nodo<tipo> viejo = inicio;
            Nodo<tipo> iterador = viejo;
            inicio = inicio.siguiente();
            while(iterador.siguiente() != viejo){
                iterador = iterador.siguiente();
            }
            iterador.apuntar(inicio);
            elementos--;
            elemento = viejo.contenido();
        }
        else {
            Nodo<tipo> iterador = inicio;
            int contador = 1;
            while(contador < indice - 1){
                    iterador = iterador.siguiente();
                    contador++;
            }
            elemento = iterador.siguiente().contenido();
            iterador.apuntar(iterador.siguiente().siguiente());
            elementos--;
        }
        return elemento;
    }
    
    public void modificar (int indice, tipo nuevo){
        if (elementos == 1){
            reiniciar();
            nuevo(nuevo);
        }
        else if (indice == 1 && elementos != 1){
            Nodo<tipo> viejo = inicio;
            Nodo<tipo> iterador = viejo;
            inicio = new Nodo<tipo>(nuevo);
            inicio.apuntar(viejo.siguiente());
            while(iterador.siguiente() != viejo){
                iterador = iterador.siguiente();
            }
            iterador.apuntar(inicio);
        }
        else {
            Nodo<tipo> iterador = inicio;
            int contador = 1;
            while(contador < indice - 1){
                    iterador = iterador.siguiente();
                    contador++;
            }
            Nodo<tipo> mod = new Nodo<tipo>(nuevo);
            mod.apuntar(iterador.siguiente().siguiente());
            iterador.apuntar(mod);
        }
    }
    
    public int cantidad (){return elementos;}
    
    public void nuevo (tipo dato){
        if (inicio == null){
            inicio = new Nodo<tipo>(dato);
            inicio.apuntar(inicio);
        }
        else{
            Nodo<tipo> iterador = inicio;
            while(true){
                if(iterador.siguiente() == inicio){
                    Nodo<tipo> nuevo = new Nodo<tipo>(dato);
                    nuevo.apuntar(inicio);
                    iterador.apuntar(nuevo);
                    break;
                }
                else{
                    iterador = iterador.siguiente();
                }
            }
        }
        elementos++;
    }
    public Nodo<tipo> cabeza (){
        return inicio;
    }
    public void reiniciar (){
        inicio = null;
        elementos = 0;
    }
}
