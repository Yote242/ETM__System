package gestor.empresarial.datos;
import java.util.ArrayList;
import java.util.List;
public class DatosPersonales {
    private int id;
    private String apellidos;
    private String nombre;
    private String whatsapp;
    private String correo;
    public DatosPersonales(int id,String apellidos,String nombre, String whatsapp, String correo) {
        this.id=id;
        this.apellidos=apellidos;
        this.nombre = nombre;
        this.whatsapp = whatsapp;
        this.correo = correo;
    }
    public int getId(){
        return id;
    }
    public String getApellidos(){
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }
    public String getWhatsapp() {
        return whatsapp;
    }
    public String getCorreo() {
        return correo;
    }
}

