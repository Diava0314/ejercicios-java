 
package ejercicio1;
import java.util.Scanner;

public class AreaDelCirculo {
    public static void main(String[] args) {

     double areaDelCirculo = 0;
     double radioDelCirculo = 0;
     Scanner scanner = new Scanner(System.in);

        System.out.println("Asigne el radio del circulo");

        radioDelCirculo = Double.parseDouble(scanner.nextLine());
        
        areaDelCirculo = Math.PI*Math.pow(radioDelCirculo, 2);

        System.out.println("El area del circulo es: " + areaDelCirculo);

        scanner.close();
    }
}
