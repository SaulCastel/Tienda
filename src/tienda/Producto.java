/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author Saul
 */
public class Producto {
    private String ID,nombre,desc,precio,existencia,rutaImg;
    
    public Producto(String ID, String nombre, String desc, String precio, 
            String existencia, String rutaImg)
    {
        setNombre(nombre);setDesc(desc);setPrecio(precio);
        setExistencia(existencia);setRutaImg(rutaImg);
        setID(ID);
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public String getID() {
        return ID;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getDesc() {
        return desc;
    }
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    public String getPrecio() {
        return precio;
    }
    public void setExistencia(String existencia) {
        this.existencia = existencia;
    }
    public String getExistencia() {
        return existencia;
    }
    public void setRutaImg(String rutaImg) {
        this.rutaImg = rutaImg;
    }
    public String getRutaImg() {
        return rutaImg;
    }
}
