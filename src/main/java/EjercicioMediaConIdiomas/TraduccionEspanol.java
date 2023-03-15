package EjercicioMediaConIdiomas;

import EjercicioMediaConIdiomas.Traduccion;

import java.util.Scanner;

public class TraduccionEspanol implements Traduccion {
    public double introducirDistancia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la distancia recorrida (km).");
        return sc.nextDouble();
    }

    public double introducirTiempo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el tiempo del recorrido (min).");
        return sc.nextDouble();
    }

    public void inicioRespuesta() {
        System.out.println("Se ha desplazado a una velocidad de");
    }

    public void finRespuesta() {
        System.out.println("km/h.");
    }

    public String unidadVelocidad() {
        return "km/h";
    }
}