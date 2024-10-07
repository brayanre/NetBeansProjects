
package prueba.multiplicar;

import java.util.Scanner;

public class Multiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //solicita ala persona el numero que desea ver en la tabla de multiplicar
        System.out.println("Por favor, digite un número del 1 al 10, para la tabla de multiplicar");
        int numero = sc.nextInt();
        System.out.println();
        
        //genera la tabla de multiplicar usando el ciclo for
        System.out.println("Tabla de multiplicar del :" + numero + "");
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}