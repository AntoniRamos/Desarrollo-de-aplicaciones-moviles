import com.sun.jdi.PathSearchingVirtualMachine;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class pregunta04 {
    String color;
    String marca;
    int añoFabric;
    String modelo;
    int Asientos;


    public static void main(String[] args) {

        Scanner objeto = new Scanner(System.in);
        pregunta04 coche1 = new pregunta04();

        System.out.println("ingrese la marca del automovil: ");
        coche1.marca= objeto.next();

        System.out.println("ingrese el modelo del automovil: ");
        coche1.modelo= objeto.next();

        System.out.println("ingrese el color del automovil: ");
        coche1.color= objeto.next();

        System.out.println("ingrese el año de fabricacion del automovil: ");
        coche1.añoFabric= objeto.nextInt();

        System.out.println("ingrese el numero de asientos del automovil: ");
        coche1.Asientos= objeto.nextInt();

        System.out.println("");
        System.out.println("DATOS DEL VEHICULO:");
        System.out.println("MARCA: "+coche1.marca );
        System.out.println("MODELO: "+coche1.modelo );
        System.out.println("COLOR: "+coche1.color );
        System.out.println("AÑO DE FABRICACION: "+coche1.añoFabric );
        System.out.println("N° ASIENTOS: "+coche1.Asientos);

    }



}
