package resol.villarA;
import java.util.ArrayList;
public class Ejercicio14 {
    public void ejecutar() {
        int[][] original = {
                {1, 2, 0, 3, 0, 7},
                {0, 0, 0, 0},
                {0, 6, 9, 8, 0, 9, 6},
                {0, 0, 0, 0, 7, 9, 0, 0},
                {0, 0, 0, 0, 0},
                {8, 7, 0, 8, 9, 0, 8}
        };

        System.out.println("Arreglo original:");
        mostrar(original);

        ArrayList<int[]> filtrado = new ArrayList<>();
        for (int[] fila : original) {
            ArrayList<Integer> sinCeros = new ArrayList<>();
            for (int num : fila) {
                if (num != 0) sinCeros.add(num);
            }
            if (!sinCeros.isEmpty()) {
                int[] nuevaFila = sinCeros.stream().mapToInt(i -> i).toArray();
                filtrado.add(nuevaFila);
            }
        }

        System.out.println("\nArreglo sin ceros:");
        for (int[] fila : filtrado) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private void mostrar(int[][] arreglo) {
        for (int[] fila : arreglo) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
