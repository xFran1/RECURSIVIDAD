
import java.awt.BorderLayout;
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
    System.out.println("Introduce una posición para calcular el resultado en fibonacci");
        int n=s.nextInt();
        System.out.println("El número de la posicion "+n+" es "+fibonacci(n));
        
        
    }
    public static int fibonacci(int n){
   if(n>1){
       return fibonacci(n-1)+fibonacci(n-2);
   }else if(n==1){
       return 1;
   }else{
       return 0;
   }
   
    }
    
    
}
