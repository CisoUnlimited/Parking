import java.util.Date;

public class Ticket {
    private final String nombreParking;
    private Date fechaEntrada;
    private Date fechaSalida;
    private float precio;

    public Ticket(String nombreParking, Date fechaEntrada, Date fechaSalida, float precio) {
        this.nombreParking = nombreParking;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.precio = precio;
    }
}
