package EjercicioBicis;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        //crea arrays para segways, giroscopios y bicicletas
        Segway[] segways = new Segway[10];
        Giroscopio[] giroscopios = new Giroscopio[10];
        Bicicleta[] bicicletas = new Bicicleta[10];

        //crea contadores para segways, giroscopios y bicicletas
        int numSegways = 0;
        int numGiroscopios = 0;
        int numBicicletas = 0;

        //crea un objeto Scanner para leer datos de la entrada estándar
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            //agrupalo en añadir ciclos y listar ciclos
            System.out.println("1. Añadir ciclo");
            System.out.println("2. Listar ciclos");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    //Añade un ciclo que pueda ser un segway, un giroscopio o una bicicleta
                    System.out.println("1. EjercicioBicis.Segway");
                    System.out.println("2. EjercicioBicis.Giroscopio");
                    System.out.println("3. EjercicioBicis.Bicicleta");
                    System.out.print("Opción: ");
                    opcion = sc.nextInt();
                    sc.nextLine();
                    switch (opcion){
                        case 1:
                            System.out.print("Marca: ");
                            String marca = sc.nextLine();
                            System.out.print("Modelo: ");
                            String modelo = sc.nextLine();
                            System.out.print("Fecha de compra (dd/mm/aaaa): ");
                            String fecha = sc.nextLine();
                            System.out.print("Autonomía (km): ");
                            Double autonomiaKm = sc.nextDouble();
                            sc.nextLine();
                            System.out.print("Altura mínima (cm): ");
                            double alturaMinima = sc.nextDouble();
                            sc.nextLine();
                            Segway s = new Segway(marca, modelo, LocalDate.parse(fecha, Ciclo.FORMATO_FECHA), autonomiaKm, alturaMinima);
                            System.out.println("EjercicioBicis.Segway añadido: " + s);
                            //añadir el segway al array de segways
                            segways[numSegways] = s;
                            numSegways++;
                            break;
                        case 2:
                            System.out.print("Marca: ");
                            marca = sc.nextLine();
                            System.out.print("Modelo: ");
                            modelo = sc.nextLine();
                            System.out.print("Fecha de compra (dd/mm/aaaa): ");
                            fecha = sc.nextLine();
                            System.out.print("Autonomía (km): ");
                            autonomiaKm = sc.nextDouble();
                            sc.nextLine();
                            Giroscopio g = new Giroscopio(marca, modelo, LocalDate.parse(fecha, Ciclo.FORMATO_FECHA), autonomiaKm);
                            System.out.println("EjercicioBicis.Giroscopio añadido: " + g);
                            //añade el giroscopio al array de giroscopios
                            giroscopios[numGiroscopios] = g;
                            numGiroscopios++;
                            break;
                        case 3:
                            System.out.print("Marca: ");
                            marca = sc.nextLine();
                            System.out.print("Modelo: ");
                            modelo = sc.nextLine();
                            System.out.print("Fecha de compra (dd/mm/aaaa): ");
                            fecha = sc.nextLine();
                            System.out.print("Número de marchas: ");
                            int numMarchas = sc.nextInt();
                            sc.nextLine();
                            Bicicleta b = new Bicicleta(marca, modelo, LocalDate.parse(fecha, Ciclo.FORMATO_FECHA), numMarchas);
                            System.out.println("EjercicioBicis.Bicicleta añadida: " + b);
                            //añade la bicicleta al array de bicicletas
                            bicicletas[numBicicletas] = b;
                            numBicicletas++;
                            break;
                    }
                    break;
                case 2:
                    //Listar ciclos
                    System.out.println("1. Segways");
                    System.out.println("2. Giroscopios");
                    System.out.println("3. Bicicletas");
                    System.out.print("Opción: ");
                    opcion = sc.nextInt();
                    sc.nextLine();
                    switch (opcion){
                        case 1:
                            //listar segways
                            for (int i = 0; i < numSegways; i++) {
                                System.out.println(segways[i]);
                            }
                            break;
                        case 2:
                            //listar giroscopios
                            for (int i = 0; i < numGiroscopios; i++) {
                                System.out.println(giroscopios[i]);
                            }
                            break;
                        case 3:
                            //listar bicicletas
                            for (int i = 0; i < numBicicletas; i++) {
                                System.out.println(bicicletas[i]);
                            }
                            break;
                    }
                    break;
            }
        } while (opcion != 3);
    }
}
