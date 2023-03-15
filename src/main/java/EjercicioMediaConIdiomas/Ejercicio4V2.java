package EjercicioMediaConIdiomas;

import java.util.Scanner;

public class Ejercicio4V2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona el idioma / Select the language:");
        System.out.println("1. Español");
        System.out.println("2. English");
        System.out.println("3. 中文 (Chino)");
        System.out.println("4. Norsk (Noruego)");
        int idioma = sc.nextInt();

        Traduccion traduccion;

        switch (idioma) {
            case 1:
                traduccion = new TraduccionEspanol();

                double distancia = traduccion.introducirDistancia();
                System.out.println("Añadido");

                double tiempo= traduccion.introducirTiempo();

                System.out.println("Añadido");

                tiempo = tiempo / 60;
                double velocidad = distancia / tiempo;

                traduccion.inicioRespuesta();
                System.out.println(velocidad + " " + traduccion.unidadVelocidad());
                traduccion.finRespuesta();
                break;
            case 2:
                traduccion = new TraduccionIngles();

                distancia = traduccion.introducirDistancia();
                System.out.println("Added");

                tiempo = traduccion.introducirTiempo();
                System.out.println("Added");

                tiempo = tiempo / 60;
                velocidad = distancia / tiempo;

                traduccion.inicioRespuesta();
                System.out.println(velocidad + " " + traduccion.unidadVelocidad());
                traduccion.finRespuesta();
                break;
            case 3:
                traduccion = new TraductorChino();

                distancia = traduccion.introducirDistancia();
                System.out.println("已添加");

                tiempo = traduccion.introducirTiempo();
                System.out.println("已添加");

                tiempo = tiempo / 60;
                velocidad = distancia / tiempo;

                traduccion.inicioRespuesta();
                System.out.println(velocidad + " " + traduccion.unidadVelocidad());
                traduccion.finRespuesta();
                break;
            case 4:
                traduccion = new TraduccionNoruego();

                distancia = traduccion.introducirDistancia();

                System.out.println("Lagt til");

               tiempo = traduccion.introducirTiempo();
                System.out.println("Lagt til");

                tiempo = tiempo / 60;
                velocidad = distancia / tiempo;

                traduccion.inicioRespuesta();
                System.out.println(velocidad + " " + traduccion.unidadVelocidad());
                traduccion.finRespuesta();
                break;
            default:
                System.out.println("Idioma no válido / Invalid language.");
                return;
        }
    }
}

