package resol.villarA;

public class Ejercicio1 {
    public void ejecutar(String[] args) {
        if (args.length < 1) {
            System.out.println("Por favor, ingrese su nombre como argumento.");
        } else {
            System.out.println("¡Hola " + args[0] + "!");
        }
    }
}



