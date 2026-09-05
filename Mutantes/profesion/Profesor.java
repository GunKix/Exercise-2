package Mutantes.profesion;  
import Mutantes.personas.Persona;

public class Profesor extends Persona {
    private String materia;
    private String institucion;
    private int aniosExperiencia;
    private static int totalMaestros = 0;

    // Constructor
    public Profesor(String pNombre, byte pEdad, String pMateria, String pInstitucion, int pAniosExperiencia) {
        super(pNombre, pEdad);
        this.materia = pMateria;
        this.institucion = pInstitucion;
        this.aniosExperiencia = pAniosExperiencia;
        totalMaestros++;
    }

    // Getters and Setters
    public String getMateria() {
        return this.materia;
    }

    public void setMateria(String pMateria) {
        this.materia = pMateria;
    }

    public String getInstitucion() {
        return this.institucion;
    }

    public void setInstitucion(String pInstitucion) {
        this.institucion = pInstitucion;
    }

    public int getAniosExperiencia() {
        return this.aniosExperiencia;
    }

    public void setAniosExperiencia(int pAniosExperiencia) {
        this.aniosExperiencia = pAniosExperiencia;
    }

    public static int getTotalMaestros() {
        return totalMaestros;
    }

     public void cantar() {
        System.out.println(this.getNombre() + " (Maestro) está cantando para sus alumnos:");
     }
    
    public void trabajar() {
        System.out.println(this.getNombre() + " está dando clase de " + this.materia + " en " + this.institucion + " (con " + this.aniosExperiencia + " años de experiencia)");
    }

    public void calificarExamenes() {
        System.out.println(this.getNombre() + " está calificando exámenes de " + this.materia);
    }
}