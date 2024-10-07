
package prueba.calculadora;
import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hola y Bienvenido a CALCULADORA tu programa basico de confianza :D");
        System.out.println("");
        System.out.println("");
        System.out.println("Ingrese el primer número:");
        double num1 = sc.nextDouble();
        System.out.println("");
        System.out.println("Ingrese el segundo número:");
        double num2 = sc.nextDouble();

        System.out.println("Seleccione la operación a desarrollar:");
        System.out.println("");
        System.out.println("1 = (Sumar)");
        System.out.println("2 = (Restar)");
        System.out.println("3 = (Multiplicar)");
        System.out.println("4 = (Dividir)");

        int opcion = sc.nextInt();
        double  resultado;

        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("no se ha seleccionado ninguna opcion (¡debes escoger un numero!).");
                break;
        }
    }
}

