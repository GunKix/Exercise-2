<img width="3826" height="1433" alt="PlantUML" src="https://github.com/user-attachments/assets/0bcf641d-790c-4b54-9e67-a79ca1f6b951" />
Exercise #2 Bryan Leiva

El programa "Mutantes" es una demostración práctica de los conceptos fundamentales de POO en Java, utilizando un sistema donde personas con diferentes profesiones pueden tener poderes especiales.
¿Qué hace el programa?
El programa crea personas que pueden tener diferentes profesiones (Doctor, Músico, Profesor) y diferentes poderes (Agua, Fuego, Aire, Tierra, Láser). El objetivo principal es demostrar cómo funcionan la herencia y el polimorfismo en Java.

Funcionamiento paso a paso:
1. Primero, crea personas básicas
El programa comienza creando personas simples (Bryan y Loana) para demostrar conceptos básicos como constructores, getters, setters y cómo funcionan las referencias a objetos.

2. Luego, crea "mutantes" con profesiones y poderes
Se crean 5 personas con diferentes combinaciones:

-Una doctora con poder de fuego
-Un músico con poder de agua
-Un profesor con poder de tierra
-Un doctor con poder de aire
-Un músico con poder láser

3. Demuestra el polimorfismo
Cuando el programa hace que todas las personas "canten" o "trabajen", cada una lo hace de manera diferente según su profesión:

-El doctor canta como doctor
-El músico canta como músico
-El profesor canta como profesor

Esto es polimorfismo: el mismo mensaje (cantar()) produce comportamientos diferentes según el tipo de objeto que lo recibe.

4. Muestra acciones específicas
Cada profesión tiene habilidades únicas:

-Los doctores pueden realizar cirugías
-Los músicos pueden dar conciertos
-Los profesores pueden calificar exámenes

5. Demuestra independencia entre profesión y poder
Los poderes son completamente independientes de la profesión. Un doctor puede tener poder de fuego, y un profesor puede tener el mismo poder. Incluso pueden intercambiar poderes entre ellos, demostrando que la profesión y el poder son conceptos separados que funcionan de manera independiente.

¿Por qué es importante?
Este programa demuestra por qué POO es poderoso y útil mediante la:

-Reutilización de código: Todas las profesiones comparten el código base de Persona
-Flexibilidad: Se pueden agregar nuevas profesiones o poderes sin modificar el código existente
-Organización: El código está estructurado en paquetes (personas, profesion, poderes)

---------------------------------------------------------------------------------------------------------------

Diagrama PlantUML
@startuml
' ============================================
' TITLE: Mutantes Project Class Diagram
' ============================================
title Mutantes Project - Class Diagram\n(Herencia, Polimorfismo y Poderes)

' ============================================
' PACKAGES
' ============================================
package "Mutantes.personas" {
    class Persona {
        - byte edad
        - String nombre
        - static int totalPersonas
        - Ipower poder
        --
        + Persona()
        + Persona(byte pEdad, String pNombre)
        + Persona(String pNombre, byte pEdad)
        + Persona(String nombre)
        + String getNombre()
        + void setNombre(String pNombre)
        + byte getEdad()
        + void setEdad(byte pEdad)
        + static int getTotalPersonas()
        + void cantar()
        + void trabajar()
        + void setPoder(Ipower pPoder)
        + void atacar()
    }
}

package "Mutantes.poderes" {
    interface Ipower {
        + void dispararPoder()
    }
    
    class Poweragua {
        + Poweragua()
        + void dispararPoder()
    }
    
    class Poweraire {
        + Poweraire()
        + void dispararPoder()
    }
    
    class Powerfuego {
        + Powerfuego()
        + void dispararPoder()
    }
    
    class Powerlaser {
        + Powerlaser()
        + void dispararPoder()
    }
    
    class Powertierra {
        + Powertierra()
        + void dispararPoder()
    }
}

package "Mutantes.profesion" {
    class Doctor {
        - String especialidad
        - String hospital
        - static int totalDeDoctores
        --
        + Doctor(String pNombre, byte pEdad, String pEspecialidad, String pHospital)
        + String getEspecialidad()
        + String getHospital()
        + void setHospital(String pHospital)
        + static int getTotalDeDoctores()
        + void cantar()
        + void trabajar()
        + void realizarCirugia()
    }
    
    class Musico {
        - String instrumento
        - String generoMusical
        - String banda
        - static int totalMusicistas
        --
        + Musico(String pNombre, byte pEdad, String pInstrumento, String pGeneroMusical, String pBanda)
        + String getInstrumento()
        + void setInstrumento(String pInstrumento)
        + String getGeneroMusical()
        + void setGeneroMusical(String pGeneroMusical)
        + String getBanda()
        + void setBanda(String pBanda)
        + static int getTotalMusicistas()
        + void cantar()
        + void trabajar()
        + void tocarConcierto()
    }
    
    class Profesor {
        - String materia
        - String institucion
        - int aniosExperiencia
        - static int totalMaestros
        --
        + Profesor(String pNombre, byte pEdad, String pMateria, String pInstitucion, int pAniosExperiencia)
        + String getMateria()
        + void setMateria(String pMateria)
        + String getInstitucion()
        + void setInstitucion(String pInstitucion)
        + int getAniosExperiencia()
        + void setAniosExperiencia(int pAniosExperiencia)
        + static int getTotalMaestros()
        + void cantar()
        + void trabajar()
        + void calificarExamenes()
    }
}

package "Mutantes.programaMutante" {
    class quickstart {
        + static void main(String[] args)
    }
}

' ============================================
' RELATIONSHIPS
' ============================================

' Inheritance (extends)
Doctor --|> Persona : extends
Musico --|> Persona : extends
Profesor --|> Persona : extends

' Interface implementation (implements)
Poweragua ..|> Ipower : implements
Poweraire ..|> Ipower : implements
Powerfuego ..|> Ipower : implements
Powerlaser ..|> Ipower : implements
Powertierra ..|> Ipower : implements

' Association (uses)
Persona --> Ipower : has a\n(composition)
quickstart ..> Persona : uses
quickstart ..> Doctor : uses
quickstart ..> Musico : uses
quickstart ..> Profesor : uses
quickstart ..> Poweragua : creates
quickstart ..> Poweraire : creates
quickstart ..> Powerfuego : creates
quickstart ..> Powerlaser : creates
quickstart ..> Powertierra : creates

' ============================================
' NOTES FOR CLARITY
' ============================================
note right of Persona
  Clase base abstracta
  Contiene el poder (Ipower)
  y métodos que serán
  sobrescritos por las
  clases hijas
end note

note right of Ipower
  Interfaz que define
  el comportamiento
  de disparar poder
end note

note bottom of quickstart
  Clase principal (Main)
  Demuestra:
  - Herencia
  - Polimorfismo
  - Independencia de poderes
end note

note top of Doctor
  Sobrescribe cantar() y trabajar()
  Añade métodos específicos:
  - realizarCirugia()
end note

note top of Musico
  Sobrescribe cantar() y trabajar()
  Añade métodos específicos:
  - tocarConcierto()
end note

note top of Profesor
  Sobrescribe cantar() y trabajar()
  Añade métodos específicos:
  - calificarExamenes()
end note

' ============================================
' LEGEND
' ============================================
legend bottom left
  | Symbol | Meaning |
  |--------|---------|
  | --|>   | Inheritance (extends) |
  | ..|>   | Interface implementation (implements) |
  | -->    | Association (uses/has a) |
  | ..>    | Dependency (uses) |
  | -      | Private |
  | +      | Public |
  | #      | Protected |
  | static | Class-level member |
end legend

@enduml
