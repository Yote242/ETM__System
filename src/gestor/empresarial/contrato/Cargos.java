package gestor.empresarial.contrato;// Definición del paquete gestor.empresarial.contrato

// Definición de la enumeración Cargos
public enum Cargos {
    // Constantes enumeradas con su respectivo nombre descriptivo
    confianza("Empleado de confianza"),
    sindicalizado("Empleado sindicalizado"),
    temporal("Empleado temporal");

    // Variable miembro para almacenar el nombre del cargo
    private final String nombre;

    // Constructor de la enumeración que recibe el nombre del cargo
    Cargos(String nombre) {
        this.nombre = nombre;
    }

    // Método toString para obtener el nombre del cargo
    @Override
    public String toString() {
        return nombre;
    }
}
