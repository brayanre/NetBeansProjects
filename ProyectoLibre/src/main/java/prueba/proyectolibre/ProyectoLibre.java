package prueba.proyectolibre;
import java.util.Scanner;
import java.util.Random;

public class ProyectoLibre {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Hello World and People :D!");
        
        //comando para esperar en segundos
        try {
            Thread.sleep(1000); // Espera 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //fin del comando para esperar codigo
        
        System.out.println(".");
        
        //comando para esperar en segundos
        try {
            Thread.sleep(1000); // Espera 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //fin del comando para esperar codigo
        
        System.out.println("."); 
        
        //comando para esperar en segundos
        try {
            Thread.sleep(1000); // Espera 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //fin del comando para esperar codigo
        
        System.out.println(".");
        System.out.println("y Bienvenidos a PIEDRA - PAPEL - TIJERAAA");
        System.out.println("Elige: ");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        
        int eleccionUsuario = sc.nextInt();

        // Generar elección de la computadora
        int eleccionComputadora = random.nextInt(3) + 1;

        System.out.println("Tu elección: " + opcionAString(eleccionUsuario));
        System.out.println("Elección de la computadora: " + opcionAString(eleccionComputadora));

        // Determinar el ganador
        if (eleccionUsuario == eleccionComputadora) {
            System.out.println("¡Es un empate!");
        } else if ((eleccionUsuario == 1 && eleccionComputadora == 3) ||
                   (eleccionUsuario == 2 && eleccionComputadora == 1) ||
                   (eleccionUsuario == 3 && eleccionComputadora == 2)) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }

        sc.close(); // Cerrar el scanner
    }

    // Método para convertir la elección en un String
    private static String opcionAString(int opcion) {
        switch (opcion) {
            case 1:
                return "Piedra";
            case 2:
                return "Papel";
            case 3:
                return "Tijera";
            default:
                return "Opción inválida";
        }
    }
}

    

