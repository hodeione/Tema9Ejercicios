package EjercicioMediaConIdiomas;

import java.util.Scanner;

public class TraductorChino implements Traduccion {
    public double introducirDistancia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入行驶距离（公里）。");
        return sc.nextDouble();
    }

    public double introducirTiempo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入行驶时间（分钟）。");
        return sc.nextDouble();
    }

    public void inicioRespuesta() {
        System.out.println("您的行驶速度为");
    }

    public void finRespuesta() {
        System.out.println("公里/小时。");
    }

    public String unidadVelocidad() {
        return "公里/小时";
    }
}
