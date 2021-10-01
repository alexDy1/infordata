import javax.xml.crypto.Data;
import java.util.Date;

public class Monitores extends Productos{
    private int definicion_maxima;

    public Monitores(int definicion_maxima, String nombre, String codigo, String modelo, String paisOrigen, Date fecha_de_fabricacion) {
        super(nombre,codigo,modelo,paisOrigen,fecha_de_fabricacion);
        this.setDefinicion_maxima(definicion_maxima);
    }

    public int getDefinicion_maxima() {
        return definicion_maxima;
    }

    public void setDefinicion_maxima(int definicion_maxima) {
        this.definicion_maxima = definicion_maxima;
    }
}
