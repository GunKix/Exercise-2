package Mutantes.profesion;  
import Mutantes.personas.Persona;

public class Doctor extends Persona {
    private String especialidad;
    private String hospital;
    private static int totalDeDoctores = 0;

    public Doctor(String pNombre, byte pEdad, String pEspecialidad, String pHospital) {
        super(pNombre, pEdad);
        this.especialidad = pEspecialidad;
        this.hospital = pHospital;
        totalDeDoctores++;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public String getHospital() {
        return this.hospital;
    }

    public void setHospital(String pHospital) {
        this.hospital = pHospital;
    }

    public static int getTotalDeDoctores() {
        return totalDeDoctores;
    }

    public void cantar(){
        System.out.println(this.getNombre()+ "Doctor esta cantando");
    }

    public void trabajar() {
        System.out.println(this.getNombre() + " está diagnosticando pacientes en " + this.hospital);
    }

    public void realizarCirugia() {
        System.out.println(this.getNombre() + " está realizando una cirugía de " + this.especialidad);
    }

    
}