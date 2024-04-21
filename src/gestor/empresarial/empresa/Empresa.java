package gestor.empresarial.empresa;
import gestor.empresarial.empleados.*;
import gestor.errores.GestionErrores;
public final class Empresa {
    private String nombreEmpresa ;
    private String representanteLegal;
    private String telefono ;
    private String rfc;
    public Empresa(){
    }
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    public String getRepresentanteLegal() {
        return representanteLegal;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getRfc() {

        return rfc;
    }
}