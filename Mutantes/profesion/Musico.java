package Mutantes.profesion;  
import Mutantes.personas.Persona;

public class Musico extends Persona {
    private String instrumento;
    private String generoMusical;
    private String banda;
    private static int totalMusicistas = 0;

    // Constructor
    public Musico(String pNombre, byte pEdad, String pInstrumento, String pGeneroMusical, String pBanda) {
        super(pNombre, pEdad);
        this.instrumento = pInstrumento;
        this.generoMusical = pGeneroMusical;
        this.banda = pBanda;
        totalMusicistas++;
    }

    // Getters and Setters
    public String getInstrumento() {
        return this.instrumento;
    }

    public void setInstrumento(String pInstrumento) {
        this.instrumento = pInstrumento;
    }

    public String getGeneroMusical() {
        return this.generoMusical;
    }

    public void setGeneroMusical(String pGeneroMusical) {
        this.generoMusical = pGeneroMusical;
    }

    public String getBanda() {
        return this.banda;
    }

    public void setBanda(String pBanda) {
        this.banda = pBanda;
    }

    public static int getTotalMusicistas() {
        return totalMusicistas;
    }

    public void cantar() {
        System.out.println(this.getNombre() + " (Músico) está cantando con su " + this.instrumento + ":");
    }
    public void trabajar() {
        System.out.println(this.getNombre() + " está practicando " + this.instrumento + " para un concierto de " + this.generoMusical + " con " + this.banda);
    }
    public void tocarConcierto() {
        System.out.println(this.getNombre() + " está dando un concierto de " + this.generoMusical + " tocando " + this.instrumento + " con " + this.banda);
    }

}