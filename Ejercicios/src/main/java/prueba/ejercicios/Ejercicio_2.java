
package prueba.ejercicios;
import java.util.Scanner;

public class Ejercicio_2 {
String marca;
String modelo;
int año;

    public Ejercicio_2(String marca, String modelo, int año ) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        
        // Crear una instancia de ConstructorDestructor
       Ejercicio_2 persona = new Ejercicio_2("Chevrolet", "JDK-023", 2015);
       System.out.println("La marca del coche es: " + persona.marca + ", El modelo del coche es: " + persona.modelo + ", El año de fabrica del coche es: " + persona.año);
    
    System.out.println("");   
    System.out.println("(acelerar)Este metodo sirve para acelerar el coche");
    System.out.println("(frenar)Este metodo sirve para frenar el coche");
    String pedal = sc.next();
    System.out.println("");
    
    switch (pedal){
    case "acelerar":
        System.out.println("has acelerado la velocidad del coche"); 
        break;
    case "frenar":
        System.out.println("has frenado la velocidad del coche");
        break;
    default:
        System.out.println("chocaste con algo o saliste volando por la carretera ._.");
        break;
    }
    }
}
