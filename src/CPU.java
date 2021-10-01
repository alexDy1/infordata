import javax.xml.crypto.Data;
import java.util.Date;

public class CPU extends Productos{
    private int memoria_principal;

    public CPU(int memoria_principal, String nombre, String codigo, String modelo, String paisOrigen, Date fecha_de_fabricacion) {
        super(nombre,codigo,modelo,paisOrigen,fecha_de_fabricacion);
        this.setMemoria_principal(memoria_principal);
    }

    public int getMemoria_principal() {
        return memoria_principal;
    }

    public void setMemoria_principal(int memoria_principal) {
        this.memoria_principal = memoria_principal;
    }
}
