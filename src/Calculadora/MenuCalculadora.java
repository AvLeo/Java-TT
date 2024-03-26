package Calculadora;
import java.util.Scanner;

public class MenuCalculadora {
    static Scanner leer = new Scanner(System.in);

    public static void showMenu(){
        int op;
        do {
            System.out.println("Ingrese un valor: \n 1- Sumar \n 2- Restar \n 3- dividir");
            System.out.print("Ingresa tu valor: ");
            op = leer.nextInt();
            switch (op){
                case 1:
                    System.out.print("Ingresa A:");
                    int a = leer.nextInt();
                    System.out.print("Ingresa B:");
                    int b = leer.nextInt();
                    System.out.println(Calculadora.sumar(a,b));
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }while (op != 1 && op != 2 && op != 3);
    }

}
