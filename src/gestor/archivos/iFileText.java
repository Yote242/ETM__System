package gestor.archivos;
interface iFileText {
    // Métodos abstractos para operaciones de lectura y escritura de archivos de texto
    public void abrirModoLectura();
    public String leer();
    public void abrirModoEscritura();
    public void escribir(String a);
    public void cerrar();
}
