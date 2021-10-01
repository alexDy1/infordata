import javax.xml.crypto.Data;
import java.util.Date;

public class HDD extends Productos{
    private double capasidad;

    public HDD(double capasidad, String nombre, String codigo, String modelo, String paisOrigen, Date fecha_de_fabricacion) {
        super(nombre,codigo,modelo,paisOrigen,fecha_de_fabricacion);
        this.setCapasidad(capasidad);
    }


    public double getCapasidad() {
        return capasidad;
    }

    public void setCapasidad(double capasidad) {
        this.capasidad = capasidad;
    }
}
