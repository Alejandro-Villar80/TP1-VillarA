package resol.villarA;
import java.util.Scanner;
public class Ejercicio4 {
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine().toLowerCase();

        int contador = 0;
        for (char c : palabra.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }

        System.out.println("Cantidad de vocales: " + contador);
    }
}
