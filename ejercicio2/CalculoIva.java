package ejercicio2;

import java.util.Scanner;

public class CalculoIva {
    public static void main(String[] args){
        double iva = 0.21;
        double precio = 0;
        double resultado = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digita el precio");

        precio = Double.parseDouble(scanner.nextLine());

        resultado = precio + (precio*iva);

        System.out.println("EL precio con el iva es: " + resultado);

    }
}

