package gestor.empresarial.datos;

import java.util.ArrayList;
import java.util.List;

public final class DatosEmpresariales{
    private String telefonoExterior;

    private String adscripcion;
    private String puesto;
    public DatosEmpresariales(String telefonoExterior, String adscripcion, String puesto){
        this.telefonoExterior = telefonoExterior;
        this.adscripcion = adscripcion;
        this.puesto = puesto;
    }
    public String getTelefonoExterior() {
        return telefonoExterior;
    }
    public String getAdscripcion() {
        return adscripcion;
    }
    public String getPuesto() {
        return puesto;
    }
}
