package gestor.empresarial.empleados;
import gestor.errores.*;
import gestor.empresarial.contrato.*;
import java.util.*;
public final class Empleados implements iEmpleados{
    int i; // Variable de tipo entero para uso interno.
    GestionErrores error; // Objeto para gestionar errores.

    // Constructor de la clase Empleados.
    public Empleados() {
        // Constructor vacío.
    }

    public void addDatosPersonales(String a,String b, String c){
//
    }
    public void addContrato(int a,int b,String c,Cargos d){
//
    }
    private int findEmpleado(int a){
        return 1;
    }
    private int findEmpleado(String a){
        return 2;
    }
    public void setWhatsap(int a, String b){
//
    }


    /*
    private String datosPersonales(int datPerson){
        return datPerson;
    }
    public String getInfoEmpleado(int infEmple){
        return infEmple;
    }
    @java.lang.Override
    public String getInfoEmpleado(String a) {
        return null;
    }
    public String getInfoEmpleado(String a) {
        return a;
    }

    */

    public void setAdscripcion(int a,String b){
//
    }
    public void setTelefonoExtension(int a,String b){
//
    }
    public void setPuesto(int a,String b){
//
    }
    public void showDatosEmpleado(){
//
    }
    public void showContradosEmpleado(int a){
    }
    public int getAntiguedad(int a){
        return 3;
    }
    public int getAntiguedad(){
        return 4;
    }
    public void setCargo(Cargos a){}
    }
