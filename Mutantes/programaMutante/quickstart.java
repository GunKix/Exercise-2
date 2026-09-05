package Mutantes.programaMutante;
import Mutantes.personas.Persona;
import Mutantes.profesion.*;
import Mutantes.poderes.*;

public class quickstart {
    public static void main(String[] args) {
        System.out.println("Hello clase de Poo");

        Persona Bryan = new Persona();
        Persona p1 = new Persona("Loana Marin", (byte)20); // transformando o casteando cast, ese 20 de int a byte

        System.out.println(Bryan.getNombre());
        Bryan.cantar();

        System.out.println("-----------------------------");

        String nombreResultado = p1.getNombre();
        System.out.println(nombreResultado);
        p1.cantar();

        System.out.println("-----------------------------");

        System.out.println("Edad de "+Bryan.getNombre()+ " " +Bryan.getEdad());
        p1.setEdad((byte)19);
        System.out.println("Edad de "+p1.getNombre()+ " "+p1.getEdad());

        System.out.println("-----------------------------");

        // aquí no hubo new, solo es un apuntador a la misma instancia a la que apunta p1
        Persona xyz = p1;
        System.out.println("Edad de "+p1.getNombre()+ " " +p1.getEdad());
        System.out.println("Edad de "+xyz.getNombre()+ " "+xyz.getEdad());

        xyz.setEdad((byte)27);
        System.out.println("Edad de "+p1.getNombre()+ " " +p1.getEdad());

        Bryan = xyz; // si se hace esto, entonces los 3 punteros (nombres de variable), apuntarían
        // a la misma instancia. Y la instancia (fragmento de memoria), quedaría innaccesible. 


       //imlementar los poderes a las personas/profesiones
        
        Persona persona1 = new Doctor("Loana Marin", (byte) 20, "Diagnóstico", "Hospital General");
        persona1.setPoder(new Powerfuego());
        
        // Persona 2: Músico con poder de AGUA
        Persona persona2 = new Musico("Bryan Leiva", (byte) 20, "Piano", "Rock", "Queen");
        persona2.setPoder(new Poweragua());
        
        // Persona 3: Profesor con poder de TIERRA
        Persona persona3 = new Profesor("Prof. Dumbledore", (byte)60, "Magia", "Hogwarts", 40);
        persona3.setPoder(new Powertierra());
        
        // Persona 4: Doctor con poder de AIRE (misma profesión que persona1, poder diferente)
        Persona persona4 = new Doctor("Dr. Strange", (byte)50, "Neurocirugía", "Metropolitan Hospital");
        persona4.setPoder(new Poweraire());
        
        // Persona 5: Músico con poder de LASER (misma profesión que persona2, poder diferente)
        Persona persona5 = new Musico("Jimi Hendrix", (byte)27, "Guitarra", "Rock", "The Jimi Hendrix Experience");
                persona5.setPoder(new Powerlaser());

        System.out.println("=== DEMOSTRACIÓN DE HERENCIA Y POLIMORFISMO ===");
        System.out.println("Cada persona canta y trabaja según su profesión:\n");


        //Demostración de herencia y polimorfismo
        Persona[] personas = {persona1, persona2, persona3, persona4, persona5};
        
        for (int i = 0; i < personas.length; i++) {
            Persona p = personas[i];
            System.out.println("--- Persona " + (i + 1) + " ---");
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Edad: " + p.getEdad());
            
            // Polimorfismo: el método cantar() se comporta diferente según la profesión
            System.out.print("Cantando: ");
            p.cantar();
            
            // Polimorfismo: el método trabajar() se comporta diferente según la profesión
            System.out.print("Trabajando: ");
            p.trabajar();
            
            
        }


        // Casting para acceder a métodos específicos de cada profesión
        Doctor doctor = (Doctor) persona1;
        System.out.println(doctor.getNombre() + " (Doctor) - Acción específica:");
        doctor.realizarCirugia();
        System.out.println();
        
        Musico musico = (Musico) persona2;
        System.out.println(musico.getNombre() + " (Músico) - Acción específica:");
        musico.tocarConcierto();
        System.out.println();
        
        Profesor profesor = (Profesor) persona3;
        System.out.println(profesor.getNombre() + " (Profesor) - Acción específica:");
        profesor.calificarExamenes();
        System.out.println();


        for (int i = 0; i < personas.length; i++) {
            Persona p = personas[i];
            System.out.print(p.getNombre() + " (" + p.getClass().getSimpleName() + ") ataca: ");
            p.atacar();
        }


        // Intercambiar poderes entre persona1 (Doctor) y persona3 (Profesor)
        System.out.println("1. " + persona1.getNombre() + " (Doctor) tenía poder de FUEGO");
        System.out.println("2. " + persona3.getNombre() + " (Profesor) tenía poder de TIERRA");
        System.out.println("\n¡Intercambiando poderes!\n");
        
        
        // Asignar poderes diferentes para demostrar
        System.out.println(persona1.getNombre() + " ahora tiene poder de TIERRA:");
        persona1.setPoder(new Powertierra());
        persona1.atacar();
        
        System.out.println(persona3.getNombre() + " ahora tiene poder de FUEGO:");
        persona3.setPoder(new Powerfuego());
        persona3.atacar();
        
        System.out.println("\n" + persona2.getNombre() + " (Músico) ahora tiene poder de LÁSER:");
        persona2.setPoder(new Powerlaser());
        persona2.atacar();


        for (int i = 0; i < personas.length; i++) {
            Persona p = personas[i];
            p.setPoder(new Powerfuego());
            System.out.print(p.getNombre() + " (" + p.getClass().getSimpleName() + ") ataca: ");
            p.atacar();
        }
    }

}

