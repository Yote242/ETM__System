package gestor.empresarial.empresa;

// Definición de la clase Empresa en el paquete gestor.empresarial.empresa
public final class Empresa {
    // Atributos de la clase Empresa
    private String nombreEmpresa;
    private String representanteLegal;
    private String telefono;
    private String rfc;

    // Constructor vacío de la clase Empresa
    public Empresa() {
    }

    // Método para obtener el nombre de la empresa
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    // Método para obtener el representante legal de la empresa
    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    // Método para obtener el teléfono de la empresa
    public String getTelefono() {
        return telefono;
    }

    // Método para obtener el RFC de la empresa
    public String getRfc() {
        return rfc;
    }
}