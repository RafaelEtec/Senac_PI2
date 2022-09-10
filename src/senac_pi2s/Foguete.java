package senac_pi2s;
/**
 * por Rafael Ferreira Goulart
 */
public class Foguete {
    
    // Atributos
    
    private String modelo = "";
    private String cor = "";
    private static String marca = "SENAC";
    private long altitudeMetros = 0;
    
    // Ações e Métodos
    
    public void decolar() {
        this.altitudeMetros = 50000;
    }
}