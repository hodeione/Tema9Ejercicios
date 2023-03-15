package EjercicioBicis;

import java.time.LocalDate;
    import java.time.format.DateTimeFormatter;

    public abstract class Ciclo {
        public static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("dd/MM/yyyy") ;
        protected String marca;
        protected String modelo;
        protected LocalDate fechaCompra;

        public Ciclo(String marca, String modelo, LocalDate fechaCompra) {
            this.marca = marca;
            this.modelo = modelo;
            this.fechaCompra = fechaCompra;
        }

        public abstract double getTarifaAlquiler();

        public String toString() {
            return marca + " " + modelo + " (" + (LocalDate.now().getYear() - fechaCompra.getYear()) + " años)";
        }
    }


