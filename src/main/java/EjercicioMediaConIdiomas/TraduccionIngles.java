package EjercicioMediaConIdiomas;

import java.util.Scanner;

public class TraduccionIngles implements Traduccion {
    public double introducirDistancia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance traveled (km).");
        return sc.nextDouble();
    }

    public double introducirTiempo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time of travel (min).");
        return sc.nextDouble();
    }

    public void inicioRespuesta() {
        System.out.println("You have traveled at a speed of");
    }

    public void finRespuesta() {
        System.out.println("km/h.");
    }

    public String unidadVelocidad() {
        return "km/h";
    }
}