package gestor.archivos;
// Importación de la clase File y las clases relacionadas con la manipulación de archivos
import java.io.*;

// Definición de la clase ArchivoTexto que extiende de ControlArchivos e implementa iFileText
public final class ArchivoTexto extends ControlArchivos implements iFileText {
    // Declaración de variables miembro
    private File file;
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;
    private BufferedWriter bw;
    private boolean archivoExiste;
    private boolean modoLectura;
    private boolean modoEscritura;

    // Constructor que recibe el título del archivo como parámetro
    public ArchivoTexto(String tituloArchivo) {
        super(); // Llamada al constructor de la clase padre

        try {
            // Creación del objeto File con el título proporcionado
            file = new File(tituloArchivo);

            // Verificación de si el archivo existe, y en caso contrario, se crea uno nuevo
            if (!file.exists())
                file.createNewFile();

            // Configuración de los indicadores de existencia y modos de operación
            this.archivoExiste = true;
            this.modoLectura = false;
            this.modoEscritura = false;
        } catch (Exception e) {
            System.out.println("Error al intentar buscar el archivo");
            this.archivoExiste = false;
        }
    }

    // Método para abrir el archivo en modo lectura
    public void abrirModoLectura() {
        if (archivoExiste == true) {
            try {
                // Inicialización de FileReader y BufferedReader para leer desde el archivo
                fr = new FileReader(this.file.getAbsoluteFile());
                br = new BufferedReader(this.fr);
                this.modoLectura = true;
                System.out.println("Archivo abierto en modo lectura");
            } catch (Exception e) {
                System.out.println("Error: El archivo no se puede abrir en modo lectura");
            }
        }
    }

    // Método para leer una línea del archivo
    public String leer() {
        if (archivoExiste == true) {
            try {
                return this.br.readLine(); // Devuelve la línea leída desde el archivo
            } catch (Exception e) {
            }
        }
        return null; // Devuelve null si no se puede leer o el archivo no existe
    }

    // Método para abrir el archivo en modo escritura
    public void abrirModoEscritura() {
        if (archivoExiste == true) {
            try {
                // Inicialización de FileWriter y BufferedWriter para escribir en el archivo
                fw = new FileWriter(this.file.getAbsoluteFile(), true);
                bw = new BufferedWriter(this.fw);
                modoEscritura = true;
                System.out.println("Archivo abierto en modo escritura");
            } catch (Exception e) {
                System.out.println("Error: El archivo no se puede abrir en modo escritura");
            }
        }
    }

    // Método para escribir texto en el archivo
    public void escribir(String texto) {
        if (archivoExiste == true) {
            try {
                this.bw.write(texto + "\n"); // Escribe el texto seguido de un salto de línea
            } catch (Exception e) {
                System.out.println("Error no se puede escribir informacion en el archivo");
            }
        }
    }

    // Método para cerrar el archivo
    public void cerrar() {
        if (modoEscritura == true) {
            try {
                this.bw.close(); // Cierra el BufferedWriter
                this.fw.close(); // Cierra el FileWriter
            } catch (Exception e) {
            }
        } else if (modoLectura == true) {
            try {
                this.br.close(); // Cierra el BufferedReader
                this.fr.close(); // Cierra el FileReader
            } catch (Exception e) {
            }
        }
    }
}
