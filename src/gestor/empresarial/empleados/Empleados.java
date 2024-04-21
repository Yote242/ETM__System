package gestor.empresarial.empleados;
import gestor.empresarial.datos.*;
import gestor.errores.GestionErrores;
import gestor.errores.*;
import gestor.empresarial.contrato.*;
import java.time.Year;

public final class Empleados implements iEmpleados {
    private int i = 0;
    public GestionErrores error;
    private static Empleados instancia = null;

    private int[] ids = new int[100];
    private DatosPersonales[] datPersonales = new DatosPersonales[100];
    private DatosEmpresariales[] datosE = new DatosEmpresariales[100];
    private Contrato[] datosC = new Contrato[100];

    public Empleados() {
    }

    public static Empleados getInstancia() {
        if (instancia == null) {
            instancia = new Empleados();
        }
        return instancia;
    }

    public void imprimirDatos() {
        if (!datosPerVacios()) {
            for (int j = 0; j < 100; j++) {
                if (datPersonales[j] != null) {
                    int id=datPersonales[j].getId();
                    String apellido=datPersonales[j].getApellidos();
                    String nombre = datPersonales[j].getNombre();
                    String correo = datPersonales[j].getCorreo();
                    String whatsapp = datPersonales[j].getWhatsapp();
                    System.out.println("ID:" + id + "\tNombre:" + nombre +"\tApellido:"+apellido + "\tCorreo:" + correo + "\tWhats:" +
                            whatsapp);
                }
            }
        }

        if (!datosEmpVacios()) {
            for (int j = 0; j < 100; j++) {
                if (datosE[j] != null) {
                    String telefono = datosE[j].getTelefonoExterior();
                    String adscripcion = datosE[j].getAdscripcion();
                    String puesto = datosE[j].getPuesto();
                    System.out.println("ID:" + ids[j] + "\tTelefono:" + telefono +
                            "\tAdscripcion:" + adscripcion + "\tPuesto:" + puesto);
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
                    System.out.println("ID:" + ids[j] + "\tNoConctato:" + noContrato + "\tAnnio:" + annio +
                            "\tHorario:" + horario + "\tCargo:" + tipoCargo);
                }
            }
        }
    }

    public void addDatosPersonales(DatosPersonales datosPersonales) {
        this.datPersonales[this.i] = datosPersonales;
        ids[i] = i + 1;
        this.i++;
    }

    public void addDatosEmpresariales(int indice, DatosEmpresariales datosEmpresariales) {
        this.datosE[indice] = datosEmpresariales;
    }

    public void addContrato(int indice, Contrato contrato) {
        this.datosC[indice] = contrato;
    }

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

    public int getID(int indice) {
        return ids[indice];
    }

    public DatosPersonales getInfoPersonal(int indice) {
        return datPersonales[indice];
    }

    public DatosEmpresariales getInfoEmpresarial(int indice) {
        return datosE[indice];
    }

    public Contrato getInfoContrato(int indice) {
        return datosC[indice];
    }

    @Override
    public Object getInfoEmpleado(int a) {
        return null;
    }

    @Override
    public String getInfoEmpleado(String b) {
        return null;
    }

    public boolean datosPerVacios() {
        int suma = 0;
        for (int j = 0; j < 100; j++) {
            if (datPersonales[j] != null) {
                suma += 1;
            }
        }
        return suma <= 0;
    }

    public boolean datosEmpVacios() {
        int suma = 0;
        for (int j = 0; j < 100; j++) {
            if (datosE[j] != null) {
                suma += 1;
            }
        }
        return suma <= 0;
    }

    public boolean datosContratoVacios() {
        int suma = 0;
        for (int j = 0; j < 100; j++) {
            if (datosC[j] != null) {
                suma += 1;
            }
        }
        return suma <= 0;
    }

    public void showDatosEmpleado() {
    }

    public void showContratosEmpleado(int i) {
    }

    public int getAntiguedad(int annio) {
        return Year.now().getValue() - annio;
    }

    public void borrarEmpleado(int indice) {
        ids[indice] = -1;
        datPersonales[indice] = null;
        datosE[indice] = null;
        datosC[indice] = null;
    }

    public void modificarEmpleado(int indice, DatosPersonales datosPersonales) {
        this.datPersonales[indice] = datosPersonales;
    }

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

