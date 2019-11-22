/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import Estructuras.Nodo;
import java.io.PrintWriter;
import tienda.Producto;

/**
 *
 * @author Noe
 */
public class Graficador {

    private static String grafo;
    
    public static void graficar(Nodo<Producto> inicio) {
        try {
            String dirDot = "C:\\Users\\Saul\\Desktop\\Lista.txt";
            
            PrintWriter writer = new PrintWriter(dirDot, "UTF-8");

            grafo = "digraph G{";

            grafo += "\nrankdir=\"LR\";\nnode [shape=box];\nnode [style=filled];"
                    + "\nnode [fillcolor=\"#EEEEEE\"];\nnode [color=\"#EEEEEE\"];"
                    + "\nedge [color=\"#31CEF0\"];\n";

            Nodo<Producto> iterador = inicio;
            int idNodo = 1;

            while (true) {
                if (iterador.siguiente() == inicio) {
                    grafo += "\n\"" + idNodo + "\"[label=\"" + iterador.contenido().getNombre()
                            + "\n" + iterador.contenido().getPrecio() + "\"];\n";
                    grafo += "\"" + (idNodo - 1) + "\"" + " -> " + "\"" + idNodo + "\";" + "\n";
                    grafo += "\"" + idNodo + "\"" + " -> " + "\"" + (idNodo - 1) + "\";" + "\n";
                    grafo += "\"" + idNodo + "\"" + " -> " + "\"" + 1 + "\";" + "\n";
                    break;
                } else {
                    grafo += "\n\"" + idNodo + "\"[label=\"" + iterador.contenido().getNombre()
                            + "\n" + iterador.contenido().getPrecio() + "\"];\n";
                    if (idNodo != 1) {
                        grafo += "\"" + (idNodo - 1) + "\"" + " -> " + "\"" + idNodo + "\";\n";
                        grafo += "\"" + idNodo + "\"" + " -> " + "\"" + (idNodo - 1) + "\";\n";
                    }
                    iterador = iterador.siguiente();
                    idNodo++;
                }
            }
            grafo += "\"" + 1 + "\"" + " -> " + "\"" + idNodo + "\";" + "\n}";

            writer.print(grafo);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
