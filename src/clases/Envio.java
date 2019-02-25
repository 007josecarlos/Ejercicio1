package clases;

public class Envio {
    private final String nombreEquipo;
    private final int numPro;
    private final String resp;

    public Envio(String nombreEquipo, int numPro, String resp) {
        this.nombreEquipo = nombreEquipo;
        this.numPro = numPro;
        this.resp = resp;
    }    
    
    //Metodos de Consulta
    public String getNombreEquipo() { return nombreEquipo; }
    public int getNumPro() { return numPro; }
    public String getResp() { return resp; }
}