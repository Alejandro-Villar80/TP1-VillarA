package resol.villarA;

import java.util.Scanner;

public class Ejercicio9 {
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        String[] palabras = frase.trim().split("[\\s,.]+");
        System.out.println("Cantidad de palabras: " + palabras.length);
    }
}
