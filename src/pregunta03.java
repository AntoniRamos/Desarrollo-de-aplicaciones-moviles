import java.util.Scanner;

public class pregunta03 {


    Scanner lector = new Scanner (System.in);

    public pregunta03(){
        double rad , area ;
        double longitud;
        System.out.println("ingrese el radio del circulo");
        rad= lector.nextDouble();

        area = Math.PI*Math.pow(rad,2);
        longitud=2*Math.PI*rad;
        System.out.println("el area del circulo es: "+area);
        System.out.println("la longitud de la circunferencia es: "+longitud);

    }

    public static void main(String[] args) {
        pregunta03 solucion = new pregunta03();

        System.out.println(solucion);




    }
}
