/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import Estructuras.ListaSimple;
import Estructuras.Nodo;
import Usuarios.Login;
import Usuarios.Usuario;

public class Tienda {

    public static ListaSimple<Usuario> usuarios = new ListaSimple();

    public static void main(String[] args) {
        Login inicio = new Login();
        inicio.setVisible(true);
    }
    /**
    * Retorna un objeto Usuario al encontrar un match 
    * en el nombnre y la contraseña
    */
    public Usuario buscarUser(String usuario, String contra) {
        Nodo<Usuario> iterador = usuarios.cabeza();
        String user, pass;
        while (true) {
            if (iterador == null) {
                break;
            } else {
                user = iterador.contenido().getUsuario();
                pass = iterador.contenido().getContra();
                if (user.equals(usuario) && pass.equals(contra)) {
                    return iterador.contenido();
                } else {
                    iterador = iterador.siguiente();
                }
            }
        }
        return null;
    }
    
    public Usuario buscarUser(String usuario) {
        Nodo<Usuario> iterador = usuarios.cabeza();
        String user;
        while (true) {
            if (iterador == null) {
                break;
            } else {
                user = iterador.contenido().getUsuario();
                
                if (user.equals(usuario)) {
                    return iterador.contenido();
                } else {
                    iterador = iterador.siguiente();
                }
            }
        }
        return null;
    }

    public void nuevoUser(Usuario nuevo) {
        usuarios.nuevo(nuevo);
    }
}
