// Definición del paquete gestor.errores
package gestor.errores;

// Importación de la clase ArchivoTexto del paquete gestor.archivos
import gestor.archivos.ArchivoTexto;

// Definición de la clase GestionErrores en el paquete gestor.errores
public final class GestionErrores {
    // Atributos de la clase GestionErrores
    private String descripcionTecnica;
    private MapError mapError;
    private ArchivoTexto archivoTexto;

    // Constructor de la clase GestionErrores
    public GestionErrores() {
        // Inicialización de objetos
        mapError = new MapError();
        archivoTexto = new ArchivoTexto("ErroresListadoEMT_System");
    }

    // Método para obtener la descripción técnica de un error
    public String getDescripcionTecnica(int noError) {
        // Obtenemos el mensaje del error que corresponde a ese número de error
        descripcionTecnica = mapError.obtenerMensajeError(noError);
        // Escribimos el código y el mensaje de error en el archivo de texto
        escribirEnArchivo(noError, descripcionTecnica);
        return descripcionTecnica;
    }

    // Método privado para escribir en el archivo de texto
    private void escribirEnArchivo(int noError, String descripcionTecnica) {
        // Abrimos el archivo en modo escritura
        archivoTexto.abrirModoEscritura();
        // Escribimos el código y el mensaje de error en el archivo de texto
        archivoTexto.escribir("Código de error: " + noError + "\t");
        archivoTexto.escribir("Mensaje de error: " + descripcionTecnica + "\n");
        // Cerramos el archivo
        archivoTexto.cerrar();
    }
}