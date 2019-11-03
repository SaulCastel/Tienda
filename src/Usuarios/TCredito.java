package Usuarios;

public class TCredito {
    private String numero, fechaV;
    private int CVC;
    
    public TCredito (String numero, int CVC, String fechaV){
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
}
