package gestor.empresarial.datos;
// Definición del paquete gestor.empresarial.datos

// Definición de la clase DatosEmpresariales en el paquete gestor.empresarial.datos
public final class DatosEmpresariales{
    // Variables miembro
    private int id;
    private String telefonoExterior;
    private String adscripcion;
    private String puesto;

    // Constructor de la clase que recibe los detalles empresariales
    public DatosEmpresariales(String telefonoExterior, String adscripcion, String puesto){
        this.telefonoExterior = telefonoExterior;
        this.adscripcion = adscripcion;
        this.puesto = puesto;
    }

    // Método getter para obtener el ID
    public int getId(){
        return id;
    }

    // Método getter para obtener el teléfono exterior
    public String getTelefonoExterior() {
        return telefonoExterior;
    }

    // Método getter para obtener la adscripción
    public String getAdscripcion() {
        return adscripcion;
    }

    // Método getter para obtener el puesto
    public String getPuesto() {
        return puesto;
    }
}