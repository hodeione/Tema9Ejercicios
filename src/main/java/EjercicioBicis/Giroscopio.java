package EjercicioBicis;

import java.time.LocalDate;

public class Giroscopio extends Ciclo {
    private double autonomiaKm;

    public Giroscopio(String marca, String modelo, LocalDate fechaCompra, double autonomiaKm) {
        super(marca, modelo, fechaCompra);
        this.autonomiaKm = autonomiaKm;
    }

    @Override
    public double getTarifaAlquiler() {
        return 29.90;
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
}
