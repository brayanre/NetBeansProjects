
package prueba.ejercicios;
import java.util.Scanner;

public class Ejercicio_4 {
String titulo;
String autor;
int NumeroPaginas;

    public Ejercicio_4(String titulo, String autor, int NumeroPaginas ) {
        this.titulo = titulo;
        this.autor = autor;
        this.NumeroPaginas = NumeroPaginas;
    }  
    
public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        
        // Crear una instancia de ConstructorDestructor
       Ejercicio_4 persona = new Ejercicio_4("Conjuros Poderosos", "Harry Potter", 666);
       System.out.println("El titulo del libro es: " + persona.titulo + ", El autor del libro es: " + persona.autor + ", El numero de paginas del libro es: " + persona.NumeroPaginas);
    
    System.out.println("");   
    System.out.println("¿que te gustaria hacer con el libro?  (leerpagina), (cerrarlibro) ");
    String libro = sc.next();
    System.out.println("");
    
    switch (libro){
    case "leerpagina":
        System.out.println("has leido 1 pagina"); 
        System.out.println("has adquirido +1 de inteligencia");
        System.out.println("");
        break;
    case "cerrarlibro":
        System.out.println("has cerrado el libro");
        System.out.println("");
        break;
    default:
        System.out.println("El libro fue raptado por un mago ancestral muy malvado con el fin de gobernar el mundo, ahora tu mision es recuperar el libro de las garras del mago malvado antes de que sea demasiado tarde, ... digo ERR ");
        break;
    }
    }    
}
