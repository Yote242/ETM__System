package gestor.errores;
import gestor.archivos.ArchivoTexto;
public final class GestionErrores {
    private String descripcionTecnica;
    private MapError mapError;
    private ArchivoTexto archivoTexto;
    public GestionErrores() {
        mapError = new MapError();

        archivoTexto = new ArchivoTexto("ErroresListadoEMT_System");


    }
    public String getDescripcionTecnica(int noError) {
// Obtenemos el mensaje del error que corresponde a ese numero de error
        descripcionTecnica = mapError.obtenerMensajeError(noError);
// Escribimos el código y el mensaje de error en el archivo de texto
        escribirEnArchivo(noError, descripcionTecnica);
        return descripcionTecnica;
    }
    private void escribirEnArchivo(int noError, String descripcionTecnica) {

        archivoTexto.abrirModoEscritura();
        archivoTexto.escribir("Código de error: " + noError + "\t");
        archivoTexto.escribir("Mensaje de error: " + descripcionTecnica + "\n");
        archivoTexto.cerrar();


    }

    }
