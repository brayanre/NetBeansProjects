
package prueba.ejercicios;
import java.util.Scanner;

public class Ejercicio_3 {
    String titular;
    double saldo;       

    public Ejercicio_3(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        Ejercicio_3 persona = new Ejercicio_3("Brayan - BancoAV", 250000);
        
        System.out.println("desea (depositar), (retirar) o (consultar) el saldo de su cuenta");
        String cuenta = sc.next();
        System.out.println("");
        
        switch (cuenta){
            case "depositar":
                System.out.println("");
                System.out.println("Ingrese la cantidad que desea depositar");
                double num1 = sc.nextDouble();
                persona.saldo += num1;  // Actualiza el saldo
                System.out.println("Se depositó en el saldo: " + num1);
                break;
    
            case "retirar":
                System.out.println("");
                System.out.println("Ingrese la cantidad que desea retirar:");
                double num2 = sc.nextDouble();
                if (num2 <= persona.saldo) { // Verifica que haya suficiente saldo
                    persona.saldo -= num2;  // Actualiza el saldo
                    System.out.println("Se retiró del saldo: " + num2);
                } else {
                    System.out.println("ERR: saldo insuficiente para retirar.");
                }
                break; 
            case "consultar":   
                System.out.println("se consulto el saldo de la cuenta");
                break;
            default:
                System.out.println("ERR: operación fallida, no se ha podido (depositar/retirar)");
                break;   
        }       
        
        System.out.println("El titular de la cuenta es: " + persona.titular + ", El saldo de la cuenta es: " + persona.saldo);        
    }
}

