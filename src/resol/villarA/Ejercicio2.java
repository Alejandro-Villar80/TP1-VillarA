package resol.villarA;

public class Ejercicio2 {
    public void ejecutar(String[] args) {
        if (args.length < 1) {
            System.out.println("Por favor, ingrese un número como argumento.");
            return;
        }

        try {
            int numero = Integer.parseInt(args[0]);
            if (numero % 2 == 0) {
                System.out.println(numero + " es un número par.");
            } else {
                System.out.println(numero + " no es un número par.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Argumento inválido. Ingrese un número entero.");
        }
    }
}
