package gestor.errores;
import gestor.archivos.ArchivoTexto;
import java.util.*;
import java.io.*;
import gestor.archivos.*;

/*
import java.util.HashMap;

import java.util.Map;

 */
public final class GestionErrores {
    Map<Integer,String> error;
    private boolean ExisteError;
    private int NoError;
    private String DescripcionTecnica;
    private String[] listaErrores=new String[10]; //Creamos la lista
    private ArchivoTexto archivo; //Creamos el objeto
    public GestionErrores(){
        /*

            error = new java.util.Map<java.lang.Integer, java.lang.String>();
            archivo=new ArchivoTexto();
            listaErrores[0]="Empleado no identificado";
            listaErrores[1]="Usuario no encontrado";
            listaErrores[2]="Contraseña Errónea";
            listaErrores[3]="Empleado no encontrado al momento de registrar su contrato";
            listaErrores[4]="Empleado no encontrado al momento de buscar un contrato";
            listaErrores[5]="Acceso Denegado";
            listaErrores[6]="Error al crear el archivo";
            listaErrores[7]="Error al editar el archivo";
        }
        private void CargarErrores(){
            try {
                BufferedReader reader = new BufferedReader(new FileReader("ruta_del_archivo.txt"));
                String linea;
                int contador = 0;
                while ((linea = reader.readLine()) != null) {
                    listaErrores[contador] = linea;
                    contador++;
                    if (contador >= listaErrores.length) {
                        break; // Evitar desbordamiento del arreglo
                    }
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("Error al leer el archivo de errores: " + e.getMessage());
            }
        }
        public void setNoError(int noError) {
            NoError = noError;
        }
        public String getError(int id){


            archivo.AbrirModoEscritura();
            archivo.escribir(listaErrores[id]);
            archivo.cerrar();
            return listaErrores[id];
        }
        public String getErrorTecnico(){
            return DescripcionTecnica;
        }
        public boolean ExisteError() {
            return ExisteError;
        }*/
    }
    }
