package resol.villarA;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione un ejercicio (1-14):");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        switch (opcion) {
            case 1:
                new Ejercicio1().ejecutar(args);
                break;
            case 2:
                new Ejercicio2().ejecutar(args);
                break;
            case 3:
                new Ejercicio3().ejecutar();
                break;
            case 4:
                new Ejercicio4().ejecutar();
                break;
            case 5:
                new Ejercicio5().ejecutar();
                break;
            case 6:
                new Ejercicio6().ejecutar();
                break;
            case 7:
                new Ejercicio7().ejecutar();
                break;
            case 8:
                new Ejercicio8().ejecutar();
                break;
            case 9:
                new Ejercicio9().ejecutar();
                break;
            case 10:
                new Ejercicio10().ejecutar();
                break;
            case 11:
                new Ejercicio11().ejecutar();
                break;
            case 12:
                new Ejercicio12().ejecutar();
                break;
            case 13:
                new Ejercicio13().ejecutar();
                break;
            case 14:
                new Ejercicio14().ejecutar();
                break;
            default:
                System.out.println("Opción inválida.");
        }

        scanner.close();
    }
}