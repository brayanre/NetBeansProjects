

package prueba.numeropar.impar;

import java.util.Scanner;

public class NumeroPARIMPAR {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hola y bienvenido a la máquina para identificar Pares e Impares :D");
        
        System.out.println("Digite un número, por favor:");
        int num = sc.nextInt();
        
        
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es: PAR");
        } 
        else {  
            System.out.println("El número " + num + " es: IMPAR");
        } 

        
    }
}