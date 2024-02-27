import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Producto {
    private String codigo;



    public Producto(String codigo)  {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
