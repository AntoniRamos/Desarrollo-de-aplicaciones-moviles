import java.util.Scanner;

public class pregunta01 {

//pregunta01
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("ingrese su nombre:");
        String name = scan.nextLine();
        System.out.println("ingrese su habilidad:");
        String habi = scan.nextLine();

        System.out.println("su nombre es: "+name +" y su habilidad es: "+habi);



    }

}
