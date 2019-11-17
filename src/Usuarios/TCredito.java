package Usuarios;

import tienda.Fecha;

public class TCredito {
    private String numero;
    private Fecha fechaV;
    private int CVC;
    
    public TCredito (String numero, int CVC, Fecha fechaV){
        this.numero = numero;
        this.CVC = CVC;
        this.fechaV = fechaV;
    }
    public String getNumero() {
        return numero;
    }
    public int getCVC() {
        return CVC;
    }
    public Fecha getFechaV() {
        return fechaV;
    }
    
}
