import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class pregunta02 {

    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);
        System.out.println("ingrese un numero entero para elevar al cuadrado:");
        int num = scan.nextInt();

        int proceso = num * num;


        System.out.println("el resutado es: "+proceso);
    }
}
