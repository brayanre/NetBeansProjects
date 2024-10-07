package prueba.ejercicios;

public class Ejercicio_6 {
    int N_lista;
    String nombre;
    String apellido;
    int edad;
    int N_identidad;

    // Constructor
    public Ejercicio_6(int N_lista ,String nombre, String apellido, int edad, int N_identidad) {
        this.N_lista = N_lista;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.N_identidad = N_identidad;
    }
    public static void main(String[] args) {
        System.out.println("Lista de Aprendices: / ambiente: 2030A / Ficha: 2922016");
        System.out.println("");
        try {
            Thread.sleep(1000); // Espera 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(".");
        try {
            Thread.sleep(1000); // Espera 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(".");
        try {
            Thread.sleep(1000); // Espera 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(".");
        try {
            Thread.sleep(1000); // Espera 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("(solo 5 (:V)  k pereza todos)");        
        System.out.println("");
        System.out.println("");

        Ejercicio_6 persona = new Ejercicio_6 ( 1, "Abad", "Meneses", 17, 1030280225);
        System.out.println ("Numero de lista: " + persona.N_lista + ",    Nombre Aprendiz: " + persona.nombre + ",         Apellido Aprendiz: " + persona.apellido + ",      edad Aprendiz: " + persona.edad+ ",    Numero de Identidad: " + persona.N_identidad );

        Ejercicio_6 persona1 = new Ejercicio_6( 2, "Alejandro", "Carvajal", 19, 1110454024);
        System.out.println("Numero de lista: " + persona1.N_lista + ",    Nombre Aprendiz: " + persona1.nombre + ",    Apellido Aprendiz: " + persona1.apellido + ",     edad Aprendiz: " + persona1.edad+ ",    Numero de Identidad: " + persona1.N_identidad );
        
        Ejercicio_6 persona2 = new Ejercicio_6( 3, "Andres", "Diaz", 20, 1110479538);
        System.out.println("Numero de lista: " + persona2.N_lista + ",    Nombre Aprendiz: " + persona2.nombre + ",       Apellido Aprendiz: " + persona2.apellido + ",         edad Aprendiz: " + persona2.edad+ ",    Numero de Identidad: " + persona2.N_identidad );
        
        Ejercicio_6 persona3 = new Ejercicio_6( 4, "Andres", "Felipe", 21, 1106227253);
        System.out.println("Numero de lista: " + persona3.N_lista + ",    Nombre Aprendiz: " + persona3.nombre + ",       Apellido Aprendiz: " + persona3.apellido + ",       edad Aprendiz: " + persona2.edad+ ",    Numero de Identidad: " + persona3.N_identidad );
        
        Ejercicio_6 persona4 = new Ejercicio_6( 5, "Angello", "Alejandro", 18, 1107976221);
        System.out.println("Numero de lista: " + persona4.N_lista + ",    Nombre Aprendiz: " + persona4.nombre + ",      Apellido Aprendiz: " + persona4.apellido + ",    edad Aprendiz: " + persona2.edad+ ",    Numero de Identidad: " + persona4.N_identidad );       
    }
}

