package resol.villarA;
import java.util.Scanner;
public class Ejercicio5 {
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine().toLowerCase();

        String invertida = new StringBuilder(palabra).reverse().toString();

        if (palabra.equals(invertida)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
    }
}
