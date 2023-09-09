package ejercicio3;

import java.util.Scanner;

public class MayorACero {
    public static void main(String[] args){

        int numero = 0;
        Scanner scanner = new Scanner(System.in);

        do{

           System.out.println("Digite un numero");
            numero = scanner.nextInt();


        }while(numero>=0);
        
        System.out.println("El numero menor a cero es: " + numero );
    }
}
