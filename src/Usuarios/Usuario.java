/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

/**
 *
 * @author Saul
 */
public class Usuario {
    private String nombre,apellido,correo,usuario,contra;
    private TCredito tarjeta; 
    //añadir tipo de cliente
    
    public Usuario(String nombre,String apellido,String correo,String usario,String contra, TCredito TC){
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contra = contra;
        this.usuario = usario;
        tarjeta = TC;
    }
    
    public Usuario(){
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContra() {
        return contra;
    }
    
    public TCredito getTCredito (){
        return tarjeta;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
}
