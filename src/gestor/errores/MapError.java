// Definición del paquete gestor.errores
package gestor.errores;

// Importación de las clases HashMap y Map del paquete java.util
import java.util.HashMap;
import java.util.Map;

// Definición de la clase MapError en el paquete gestor.errores
public class MapError {
    // Atributo de la clase MapError
    private Map<Integer, String> errores;

    // Constructor de la clase MapError
    public MapError() {
        // Inicialización del HashMap
        errores = new HashMap<>();
        // Llamada al método para inicializar los errores
        inicializarErrores();
    }

    // Método privado para inicializar los errores
    private void inicializarErrores() {
        // Asignación de códigos de error y sus respectivos mensajes
        errores.put(1, "No seleccionó ninguna opción válida");
        errores.put(2, "El usuario o la contraseña son incorrectos, favor de ingresar datos válidos");
        errores.put(3, "No se encontró ningún contrato");
        errores.put(4, "Este ID no existe");
        errores.put(5, "ID no válido");
        errores.put(6, "Datos duplicados");
    }

    // Método para obtener el mensaje de error dado un código de error
    public String obtenerMensajeError(int codigoError) {
        return errores.get(codigoError);
    }
}
