package EjercicioBicis;

import java.time.LocalDate;

public class Bicicleta extends Ciclo {
    private int numVelocidades;

    public Bicicleta(String marca, String modelo, LocalDate fechaCompra, int numVelocidades) {
        super(marca, modelo, fechaCompra);
        this.numVelocidades = numVelocidades;
    }

    @Override
    public double getTarifaAlquiler() {
        return 4.90;
    }

    public String toString() {
        return super.toString() + " " + numVelocidades + " velocidades";
    }

    public int getNumVelocidades() {
        return numVelocidades;
    }

    public void setNumVelocidades(int numVelocidades) {
        this.numVelocidades = numVelocidades;
    }
}
