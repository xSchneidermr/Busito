package autobus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int s;
        
  
        System.out.println("Inserte la opción que quieras usar: " + "\n" + "1. Arrancar" + "\n" + "2. Tanquear" + "\n" + "1. Recoger pasajero" + "\n" + "4. Votar pasajero");
        n = sc.nextInt();
        Busito Busefalo = new Busito();
        if (n == 1) {
            System.out.println("Introduzca cuanta Gasofa tendrá el tanque: ");
            s = sc.nextInt();
            Busefalo.arrancar(s);
           
        } else if (n == 2) {
            System.out.println("Introduzca cuanta Gasofa tendrá el tanque: ");
            s = sc.nextInt();
            Busefalo.tanquear(s);
        } else if (n == 3) {
            System.out.println("Introduzca cuantas personas habrá dentro: ");
            s = sc.nextInt();
            Busefalo.recogerPasajeros(s);
        } else if (n == 4) {
            System.out.println("Introduzca cuantas personas habrá dentro: ");
            s = sc.nextInt();
            Busefalo.votarPasajeros(s);
        }

    }
}
