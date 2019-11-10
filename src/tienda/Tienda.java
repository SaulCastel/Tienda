/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import Estructuras.CircularSimp;
import Estructuras.ListaSimple;
import Estructuras.Nodo;
import Usuarios.Login;
import Usuarios.Usuario;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tienda {
    private static String rutaProd = "/home/saul/Desktop/Calificacion/ProdIdent2.proadd";
    public static CircularSimp<Producto> productos = new CircularSimp();
    public static ListaSimple<Usuario> usuarios = new ListaSimple();
    private static FileReader archivo;
    private static BufferedReader buffer;
    public static void main(String[] args) {
        Login inicio = new Login();
        inicio.setVisible(true);
        if (!rutaProd.equals("Ningun Archivo")){
            cargarTienda();
        }
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
    public static void cargarTienda (){
        try {
            archivo = new FileReader(rutaProd);
            buffer = new BufferedReader(archivo);
            String linea = buffer.readLine();
            String[] datos;
            while(linea != null){
                datos = linea.split(",");
                Producto agregar = 
                    new Producto(datos[0],datos[1],datos[2],datos[3],datos[4],datos[5]);
                productos.nuevo(agregar);
                System.out.println(linea);
                linea = buffer.readLine();
            }
        } catch (IOException ex) {
            System.out.println("Hubo problemas hijo");
        } finally{
            try{
                archivo.close();
                buffer.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
            
    }
    
    public static void setRuta (String ruta){
        rutaProd = ruta;
    }
    public static String getRuta() {
        return rutaProd;
    }
    
}
