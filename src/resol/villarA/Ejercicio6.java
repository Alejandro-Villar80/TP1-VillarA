package resol.villarA;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio6 {
    public void ejecutar() {
        Random random = new Random();
        int secreto = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int intento;

        System.out.println("Adivina el número (entre 1 y 100):");

        do {
            intento = scanner.nextInt();
            if (intento < secreto) {
                System.out.println("Más alto...");
            } else if (intento > secreto) {
                System.out.println("Más bajo...");
            }
        } while (intento != secreto);

        System.out.println("¡Correcto! El número era " + secreto);
    }
}
