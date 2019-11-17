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
public class Fecha {
    int dia, mes, anyo;
    
    public Fecha (int dia, int mes, int anyo){
        this.dia = dia; this.mes = mes;
        this.anyo = anyo;
    }

    public int getAnyo() {
        return anyo;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }
    
    public String toString() {
        return dia + "/" + mes + "/" + anyo;
    }
}
