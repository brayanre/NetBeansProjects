package prueba.mayor_menor_edad;
import java.util.Scanner;

public class Mayor_Menor_EDAD {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hola, por favor ingresa tu edad:");
        int edad = sc.nextInt();
        
        if (edad >= 18) {
            System.out.println("Eres MAYOR de edad.");
        } else {
            System.out.println("Eres MENOR de edad.");
        }

        
    }
}

