package resol.villarA;

import java.util.Scanner;

public class Ejercicio11 {
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    private int fibonacci(int n) {
        if (n <= 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
