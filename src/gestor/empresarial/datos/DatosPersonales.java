package gestor.empresarial.datos;// Definición del paquete gestor.empresarial.datos

// Definición de la clase DatosPersonales en el paquete gestor.empresarial.datos
public class DatosPersonales {
    // Variables miembro
    private int id;
    private String apellidos;
    private String nombre;
    private String whatsapp;
    private String correo;

    // Constructor de la clase que recibe los datos personales
    public DatosPersonales(int id, String nombre, String apellidos, String correo, String whatsapp) {
        this.id = id;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.whatsapp = whatsapp;
        this.correo = correo;
    }

    // Método getter para obtener el ID
    public int getId(){
        return id;
    }

    // Método getter para obtener los apellidos
    public String getApellidos(){
        return apellidos;
    }

    // Método getter para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método getter para obtener el número de WhatsApp
    public String getWhatsapp() {
        return whatsapp;
    }

    // Método getter para obtener el correo electrónico
    public String getCorreo() {
        return correo;
    }
}

