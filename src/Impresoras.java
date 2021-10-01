import java.util.Date;

public class Impresoras extends Productos {
    private int velocidad;

    public Impresoras(int velocidad, String nombre,String codigo, String modelo,String paisOrigen, Date fecha_de_fabricacion) {
        super(nombre,codigo,modelo,paisOrigen,fecha_de_fabricacion);
        this.setVelocidad(velocidad);
    }


    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
