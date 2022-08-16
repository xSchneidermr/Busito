package autobus;

public class Busito {

    static public int capTanque, capPasajeros, pasAbordo, litrosActual;

    public static int getCapTanque() {
        return capTanque;
    }

    public static void setCapTanque(int capTanque) {
        Busito.capTanque = capTanque;
    }

    public static int getCapPasajeros() {
        return capPasajeros;
    }

    public static void setCapPasajeros(int capPasajeros) {
        Busito.capPasajeros = capPasajeros;
    }

    public static int getPasAbordo() {
        return pasAbordo;
    }

    public static void setPasAbordo(int pasAbordo) {
        Busito.pasAbordo = pasAbordo;
    }

    public static int getLitrosActual() {
        return litrosActual;
    }

    public static void setLitrosActual(int litrosActual) {
        Busito.litrosActual = litrosActual;
    }

    public Busito() {
        capTanque = 100;
        capPasajeros = 27;
    }

    int recogerPasajeros(int pasajeros) {
        pasAbordo += pasajeros;
        if (pasAbordo > capPasajeros) {
            System.out.println("Papi aqui no entra");
            pasAbordo = pasAbordo - pasajeros;
        } else {
            System.out.println("Tenemos " + pasAbordo + " peludos");
        }

        return pasAbordo;
    }

    int votarPasajeros(int pasajeros) {
        pasAbordo = pasAbordo - pasajeros;
        if (pasAbordo < 1) {
            System.out.println("el conductor lo atracan solo cuando llega a la estación :)");
            pasAbordo = 1;
        } else {

            System.out.println("Tenemos " + pasAbordo + " peludos");
        }
        return pasAbordo;
    }

    int arrancar(int litrosActual) {
        if (litrosActual <= 5) {
            System.out.println("Vaya llenelo pa'");
        } else {
            System.out.println("Prendalo Papi");
        }
        return litrosActual;
    }

    int tanquear(int litrosActual) {
        int cant = capTanque - litrosActual;
        System.out.println("se debe de tanquear " + cant + " litros");
        litrosActual = cant + litrosActual;
        System.out.println("El tanque quedó con " + litrosActual);

        return litrosActual;

    }

}
