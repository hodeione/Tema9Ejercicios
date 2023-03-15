package EjercicioMediaConIdiomas;

import java.util.Scanner;

class TraduccionNoruego implements Traduccion {
    public double introducirDistancia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv inn den tilbakelagte avstanden (km).");
        return sc.nextDouble();
    }

    public double introducirTiempo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv inn tiden for reisen (min).");
        return sc.nextDouble();
    }

    public void inicioRespuesta() {
        System.out.println("Du har beveget deg i en hastighet på");
    }

    public void finRespuesta() {
        System.out.println("km/t.");
    }

    public String unidadVelocidad() {
        return "km/t";
    }
}