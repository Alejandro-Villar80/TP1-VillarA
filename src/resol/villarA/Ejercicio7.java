package resol.villarA;
import java.util.Scanner;
public class Ejercicio7 {
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMENÚ:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese dos números: ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println("Resultado: " + (a + b));
                    break;
                case 2:
                    System.out.print("Ingrese dos números: ");
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    System.out.println("Resultado: " + (x - y));
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 3);
    }
}
