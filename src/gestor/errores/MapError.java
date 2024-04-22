package gestor.errores;
import java.util.HashMap;
import java.util.Map;
public class MapError {
    private Map<Integer, String> errores;
    public MapError() {
        errores = new HashMap<>();
        inicializarErrores();
    }
    private void inicializarErrores() {
        errores.put(1, "No selecciono ninguna opcion valida");
        errores.put(2, "El usuario o contraseña son incorrectos, favor de ingresar datos validos");
        errores.put(3, "No se encontro ningun contrato");
        errores.put(4, "Este ID no existe");
        errores.put(5, "ID no valido");
        errores.put(6, "Datos duplicados");
    }
    public String obtenerMensajeError(int codigoError) {
        return errores.get(codigoError);
    }
}
