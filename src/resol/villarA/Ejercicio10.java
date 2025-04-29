package resol.villarA;

import java.util.Scanner;

public class Ejercicio10 {
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una contraseña: ");
        String pass = scanner.nextLine();

        int mayus = 0, minus = 0, digitos = 0;

        for (char c : pass.toCharArray()) {
            if (Character.isUpperCase(c)) mayus++;
            else if (Character.isLowerCase(c)) minus++;
            else if (Character.isDigit(c)) digitos++;
        }

        if (pass.length() >= 8 && mayus >= 2 && minus >= 3 && digitos >= 2) {
            System.out.println("Contraseña segura.");
        } else {
            System.out.println("Contraseña insegura.");
        }
    }
}
