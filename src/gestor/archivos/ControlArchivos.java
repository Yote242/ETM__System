package gestor.archivos;// Importación de las clases necesarias para la manipulación de archivos
import java.io.*;

// Definición de la clase abstracta ControlArchivos
public abstract class ControlArchivos {
    // Variable miembro para almacenar el nombre del archivo
    private String archivo;

    // Constructor por defecto
    public ControlArchivos() {
        this.archivo = archivo; // Inicialización de la variable archivo
    }

    // Método para crear un archivo
    public boolean crear() {
        File file = new File(archivo); // Creación del objeto File
        try {
            if (file.exists()) {
                System.out.println("Error: El archivo ya existe."); // Mensaje de error si el archivo ya existe
                return false;
            } else {
                if (file.createNewFile()) {
                    System.out.println("Archivo creado exitosamente."); // Mensaje de éxito si el archivo se crea correctamente
                    return true;
                } else {
                    System.out.println("Error: No se pudo crear el archivo."); // Mensaje de error si no se puede crear el archivo
                    return false;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage()); // Mensaje de error general
            return false;
        }
    }

    // Método para eliminar un archivo
    public boolean eliminar() {
        File file = new File(archivo); // Creación del objeto File
        try {
            if (file.exists()) {
                // Confirmación de eliminación
                // Cerrar y eliminar si es posible
                if (file.delete()) {
                    System.out.println("Archivo eliminado exitosamente."); // Mensaje de éxito si el archivo se elimina correctamente
                    return true;
                } else {
                    System.out.println("Error: No se pudo eliminar el archivo."); // Mensaje de error si no se puede eliminar el archivo
                    return false;
                }
            } else {
                System.out.println("Error: El archivo no existe."); // Mensaje de error si el archivo no existe
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage()); // Mensaje de error general
            return false;
        }
    }

    // Método para cambiar el nombre del archivo
    public boolean cambiar(String archivo) {
        ArchivoTexto obj = new ArchivoTexto(archivo); // Creación de un objeto ArchivoTexto
        obj.abrirModoEscritura(); // Apertura del archivo en modo escritura
        return true; // Retorna verdadero
    }

    // Método para mover el archivo a una nueva ubicación
    public boolean mover(String archivo) {
        File file = new File(archivo); // Creación del objeto File
        try {
            String nuevaUbicacion = null;
            File nuevaUbicacionFile = new File(nuevaUbicacion);
            if (file.exists()) {
                if (file.renameTo(nuevaUbicacionFile)) {
                    System.out.println("Archivo movido exitosamente."); // Mensaje de éxito si el archivo se mueve correctamente
                    return true;
                } else {
                    System.out.println("Error: No se pudo mover el archivo."); // Mensaje de error si no se puede mover el archivo
                    return false;
                }
            } else {
                System.out.println("Error: El archivo no existe."); // Mensaje de error si el archivo no existe
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage()); // Mensaje de error general
            return false;
        }
    }
}

