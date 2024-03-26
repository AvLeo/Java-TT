import Calculadora.MenuCalculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        // 0 1 2
        //[0,0,0]

        int[][] numerosDos = {{1, 2, 3, 4, 5},{1, 2, 3, 4, 5}};

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == 0){
                numeros[i] = leer.nextInt();
            }
        }

    }

}