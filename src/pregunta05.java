import java.util.Scanner;

public class pregunta05 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int n;

        System.out.println("por favor ingrese el numero a evaluar: ");
        n= scan.nextInt();

        if (n% 2 ==0){
            System.out.println(n+ " es un numero par");
            }
        else {
            System.out.println(n+" no es un numero par");
        }

    }
}
