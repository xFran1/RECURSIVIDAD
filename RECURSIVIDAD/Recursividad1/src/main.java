
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Fran
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduce un numero: ");
        int n = s.nextInt();
        System.out.println("El factorial de " + n + " es " + factorial(n));
    }
    
    /*
    Ejercicio 1. Programar una función recursiva que calcule el factorial de un número dado.
 Fn=n * Fn-1
 

    
    */
    
    public static int factorial(int x) {
                
        if (x==0) {  
          return 1;  // F(0)=1
        }
        else{
                                   //Fn=n * Fn-1
          return x*factorial(x-1); //F(x)=(x) * F(x-1)
        }
    }
    
}
