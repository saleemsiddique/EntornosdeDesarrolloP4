import es.iesmz.prueba.Coche;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca marca del coche");
        String marca= sc.nextLine();
        System.out.println("Introduzca modelo del coche");
        String modelo = sc.nextLine();
        System.out.println("Introduzca color del coche");
        String color = sc.nextLine();
        Coche c1 = new Coche(marca, modelo, color);
        System.out.println("A cuanto llega a acelerar: ");
        c1.acelera(validaInt());
        System.out.println("Cuanto va a frenar el coche: ");
        c1.frena(validaInt());
        System.out.println("Velocidad actual: ");
        System.out.println(c1.getVelocidad());
        System.out.println("Posicion parada");
        System.out.println();
        c1.para();
        System.out.println(c1.getVelocidad());
    }

    public static int validaInt(){
        Scanner sc = new Scanner(System.in);
        int n;
        while (!sc.hasNextInt()){
            System.out.println("Esto no es un numero! Pruebe otra vez: ");
            sc.next();
        }
        n = sc.nextInt();
        return n;
    }
}
