package gestor.empresarial.empleados;// Definición del paquete gestor.empresarial.empleados
import gestor.empresarial.datos.*;
import gestor.errores.GestionErrores;
import gestor.empresarial.contrato.*;
import java.time.Year;

// Definición de la clase Empleados en el paquete gestor.empresarial.empleados
public final class Empleados implements iEmpleados {
    // Variables miembro
    private int i = 0;
    public GestionErrores error;
    private static Empleados instancia = null;
    private int[] ids = new int[100];
    private DatosPersonales[] datPersonales = new DatosPersonales[100];
    private DatosEmpresariales[] datosE = new DatosEmpresariales[100];
    private Contrato[] datosC = new Contrato[100];

    // Constructor por defecto
    public Empleados() {}

    // Método estático para obtener la instancia de Empleados
    public static Empleados getInstancia() {
        if (instancia == null) {
            instancia = new Empleados();
        }
        return instancia;
    }

    // Método para imprimir los datos de los empleados
    public void imprimirDatos() {
        if (!datosPerVacios()) {
            for (int j = 0; j < 100; j++) {
                if (datPersonales[j] != null) {
                    int id = datPersonales[j].getId();
                    String apellido = datPersonales[j].getApellidos();
                    String nombre = datPersonales[j].getNombre();
                    String correo = datPersonales[j].getCorreo();
                    String whatsapp = datPersonales[j].getWhatsapp();
                    System.out.println("ID:" + id + "\tNombre:" + nombre + "\tApellido:" + apellido + "\tCorreo:" + correo + "\tWhats:" + whatsapp);
                }
            }
        }

        if (!datosEmpVacios()) {
            for (int j = 0; j < 100; j++) {
                if (datosE[j] != null) {
                    String telefono = datosE[j].getTelefonoExterior();
                    String adscripcion = datosE[j].getAdscripcion();
                    String puesto = datosE[j].getPuesto();
                    System.out.println("ID:" + ids[j] + "\tTelefono:" + telefono + "\tAdscripcion:" + adscripcion + "\tPuesto:" + puesto);
                }
            }
        }
        if (!datosContratoVacios()) {
            for (int j = 0; j < 100; j++) {
                if (datosC[j] != null) {
                    int noContrato = datosC[j].getNoContrato();
                    int annio = datosC[j].getAnnio();
                    String horario = datosC[j].getHorario();
                    Cargos tipoCargo = datosC[j].getTipoCargo();
                    System.out.println("ID:" + ids[j] + "\tNoConctato:" + noContrato + "\tAnnio:" + annio + "\tHorario:" + horario + "\tCargo:" + tipoCargo);
                }
            }
        }
    }

    // Método para agregar datos personales de un empleado
    public void addDatosPersonales(DatosPersonales datosPersonales) {
        this.datPersonales[this.i] = datosPersonales;
        ids[i] = i + 1;
        this.i++;
    }

    // Método para agregar datos empresariales de un empleado
    public void addDatosEmpresariales(DatosEmpresariales datosEmpresariales) {}

    // Método para agregar contrato de un empleado
    public void addContrato(int indice, Contrato contrato) {
        this.datosC[indice] = contrato;
    }

    // Método para encontrar un empleado por su ID
    public int findEmpleado(int id) {
        int indice = -1;
        for (int j = 0; j < 100; j++) {
            if (ids[j] == id) {
                indice = j;
                break;
            }
        }
        return indice;
    }

    // Método para encontrar un empleado por su nombre
    public int findEmpleado(String nombre) {
        int indice = -1;
        for (int j = 0; j < 100; j++) {
            if (datPersonales[j] != null && datPersonales[j].getNombre().equals(nombre)) {
                indice = j;
                break;
            }
        }
        return indice;
    }

    // Método para obtener el ID de un empleado
    public int getID(int indice) {
        return ids[indice];
    }

    // Método para obtener los datos personales de un empleado
    public DatosPersonales getInfoPersonal(int indice) {
        return datPersonales[indice];
    }

    // Método para obtener los datos empresariales de un empleado
    public DatosEmpresariales getInfoEmpresarial(int indice) {
        return datosE[indice];
    }

    // Método para obtener el contrato de un empleado
    public Contrato getInfoContrato(int indice) {
        return datosC[indice];
    }

    // Método para obtener información de un empleado
    @Override
    public Object getInfoEmpleado(int a) {
        return null;
    }

    // Método para obtener información de un empleado
    @Override
    public String getInfoEmpleado(String b) {
        return null;
    }

    // Método para verificar si los datos personales están vacíos
    public boolean datosPerVacios() {
        int suma = 0;
        for (int j = 0; j < 100; j++) {
            if (datPersonales[j] != null) {
                suma += 1;
            }
        }
        return suma <= 0;
    }

    // Método para verificar si los datos empresariales están vacíos
    public boolean datosEmpVacios() {
        int suma = 0;
        for (int j = 0; j < 100; j++) {
            if (datosE[j] != null) {
                suma += 1;
            }
        }
        return suma <= 0;
    }

    // Método para verificar si los datos de contrato están vacíos
    public boolean datosContratoVacios() {
        int suma = 0;
        for (int j = 0; j < 100; j++) {
            if (datosC[j] != null) {
                suma += 1;
            }
        }
        return suma <= 0;
    }

    // Método para mostrar los datos de un empleado
    public void showDatosEmpleado() {}

    // Método para mostrar los contratos de un empleado
    public void showContratosEmpleado(int i) {}

    // Método para obtener la antigüedad de un empleado
    public int getAntiguedad(int annio) {
        return Year.now().getValue() - annio;
    }

    // Método para borrar los datos de un empleado
    public void borrarEmpleado(int indice) {
        ids[indice] = -1;
        datPersonales[indice] = null;
        datosE[indice] = null;
        datosC[indice] = null;
    }

    // Método para modificar los datos de un empleado
    public void modificarEmpleado(int indice, DatosPersonales datosPersonales) {
        this.datPersonales[indice] = datosPersonales;
    }

    // Método para buscar duplicados en los datos personales de un empleado
    public boolean buscarDuplicadosP(int id, String nombre, String whatsapp, String correo) {
        boolean hayDuplicados = false;
        for (int j = 0; j < 100; j++) {
            DatosPersonales obj = getInfoPersonal(j);
            if (obj != null) {
                int idP = ids[j];
                String nombreP = obj.getNombre();
                String whatsP = obj.getWhatsapp();
                String correoP = obj.getCorreo();
                if (idP == id || nombreP.equals(nombre) || whatsP.equals(whatsapp) || correoP.equals(correo)) {
                    hayDuplicados = true;
                    break;
                }
            }
        }
        return hayDuplicados;
    }
}

