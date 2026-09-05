/*
Nombres de clase: La primer letra en mayúscula, esto por lo general son sustantivos o entidades, 
cosas reales, su nombre en Singular. 
Ej. Arbol, Casa, Carro, Persona. 

Atributos: La primer letra minúscula, y si son varias palabras juntas, la primer letra de las 
segunda palabra en adelante, en mayúscula. son adjetivos, características de la clase. 
Ej. impuestoDeVenta, fechaIngreso, cantidadSeleccionada, cantidad, tamaño

Métodos: mismo estandard de nombres que los atributos, pero inicia con un verbo, porque esto es comportamiento, es acción.
Ej. cantar(), extraerDatosFinancieros(), obtenerEdad(), animarMovimiento()

Parámetros de los métodos: los nombres de los parámetros van a iniciar con p minúscula, y la siguiente letra en 
mayuscula, siguiendo camelCase
*/
package Mutantes.personas;
import Mutantes.poderes.Ipower;

public class Persona {
    private byte edad;
    private String nombre;
    private static int totalPersonas = 0;
    private Ipower poder;

    // constructor no tiene valor de retorno, y debe llamarse igual que la clase
    public Persona() { // los constructores primero reservan memoria y luego se ejecutan
        // inicializar persona con sus datos, edad y nombre. 
        edad = 20;
        nombre = "Bryan Leiva";
        totalPersonas++;
    }

    // Un segundo constructor que si recibe parámetros
    public Persona(byte pEdad, String pNombre) {
        this.edad = pEdad;
        this.nombre = pNombre;
        totalPersonas++;
    }

    // java y en general los lenguajes de programción orientados a objetos 
    // distinguen las firmas de los métodos por el nombre del método
    // y el orden de los tipos de datos, NO DE LOS NOMBRES DE LOS PARÁMETROS; si no del DataType

    public Persona(String pNombre, byte pEdad) {
        this.edad = pEdad;
        this.nombre = pNombre;
        totalPersonas++;
    }

    public Persona(String nombre) {
        this.edad = 0; // asigna un valor por default
        this.nombre = nombre;  // a pesar de que el parámetro se llama igual al atributo, 
        // java no sufre de ambiguedad, porque el puntero this, se refiere a estrictamente
        // esta instancia, por lo que accede al atributo de la instancia.
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }
    // a esto se le va a llamar getters and setters
    // métodos get para leer los valores de los atributos de la instancia
    // métodos set para escribir los valores de los atributos de la instancia
    public byte getEdad() {
        return this.edad;
    }

    public void setEdad(byte pEdad) {
        this.edad = pEdad;
    }

    public static int getTotalPersonas() {
        return totalPersonas;
    }

    public void cantar() {
        // impriman un verso de no más de 4 líneas, de una canción que les guste y el autor. 
        System.out.println("Ya me siento un niño de papel que vive con miedo de olvidar" + "\n" +
            "Cuando sonrojabas esas mejillas con sentimientos de cristal" + "\n" +
            "Por la noche, exploto y pienso en terminar con todo y volver a mí" + "\n" +
            "Hoy la vida llora porque perdió otra hermosa flor de su jardín."  + "\n" + 
            "Milo J");
    }

    public void trabajar() {
        System.out.println(this.nombre + " está trabajando.");
    }

    public void setPoder(Ipower pPoder) {
        this.poder = pPoder;
    }

    public void atacar(){
        this.poder.dispararPoder();
    }
}

