package EjercicioBicis;

import java.time.LocalDate;

public class Segway extends Ciclo {
    private double autonomiaKm;
    private double alturaMinima;

    public Segway(String marca, String modelo, LocalDate fechaCompra, double autonomiaKm, double alturaMinima) {
        super(marca, modelo, fechaCompra);
        this.autonomiaKm = autonomiaKm;
        this.alturaMinima = alturaMinima;
    }


    @Override
    public double getTarifaAlquiler() {
        return 18.90;
    }

    public String toString() {
        return super.toString() + " " + autonomiaKm + " km de autonomía";
    }

    public double getAutonomiaKm() {
        return autonomiaKm;
    }

    public void setAutonomiaKm(double autonomiaKm) {
        this.autonomiaKm = autonomiaKm;
    }

    public double getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(double alturaMinima) {
        this.alturaMinima = alturaMinima;
    }
}
