package resol.villarA;

import java.util.Scanner;

public class Ejercicio8 {
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la conversión:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        int opcion = scanner.nextInt();

        System.out.print("Ingrese la temperatura: ");
        double temp = scanner.nextDouble();

        if (opcion == 1) {
            double fahrenheit = (temp * 9 / 5) + 32;
            System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
        } else if (opcion == 2) {
            double celsius = (temp - 32) * 5 / 9;
            System.out.println("Temperatura en Celsius: " + celsius);
        } else {
            System.out.println("Opción inválida.");
        }
    }
}
