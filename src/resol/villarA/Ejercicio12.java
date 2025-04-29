package resol.villarA;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class Ejercicio12 {
    public void ejecutar() {
        Scanner scanner=new Scanner(System.in);
        Integer[] numeros=new Integer[5];

        System.out.println("Ingrese 5 numeros: ");
        for (int i = 0; i< 5; i++) {
            numeros[i]=scanner.nextInt();
        }
        Arrays.sort(numeros,Collections.reverseOrder());

        System.out.println("Numeros ordenados de mayor a menor: ");
        for(int num:numeros){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
