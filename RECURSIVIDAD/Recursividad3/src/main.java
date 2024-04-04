import java.util.Scanner;

public class main {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("Introduce una palabra:");
        String palabra = s.next();
        System.out.println("La palabra dada la vuelta es: "+vueltaPalabra(palabra));

    }
    public static String vueltaPalabra(String palabra){
        
        if(palabra.length()==0){
            return palabra;
            }else{
                return palabra;
            }
        
    }
    
        
}
