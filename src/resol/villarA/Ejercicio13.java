package resol.villarA;
public class Ejercicio13 {
    public void ejecutar() {
        String[] estudiantes = {"Ana", "Luis", "Marta"};
        double[][] notas = {
                {7.5, 8.0, 9.0},
                {6.0, 7.5, 8.0},
                {9.0, 9.5, 10.0}
        };

        for (int i = 0; i < estudiantes.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / notas[i].length;
            System.out.println(estudiantes[i] + ": promedio = " + promedio);
        }
    }
}