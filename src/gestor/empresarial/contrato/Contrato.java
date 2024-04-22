package gestor.empresarial.contrato;
// Importación de las clases necesarias
import gestor.empresarial.contrato.Cargos;
import gestor.errores.GestionErrores;
import java.util.ArrayList;
import java.util.List;

// Definición de la clase Contrato en el paquete gestor.empresarial.contrato
public final class Contrato {
    // Variables miembro
    private int id;
    private int noContrato;
    private int annio;
    private String horario;
    private Cargos tipoCargo;

    // Constructor de la clase que recibe los detalles del contrato
    public Contrato(int noContrato, int annio, String horario, Cargos tipoCargo){
        this.noContrato = noContrato;
        this.annio = annio;
        this.horario = horario;
        this.tipoCargo = tipoCargo;
    }

    // Método getter para obtener el ID del contrato
    public int getId(){
        return id;
    }

    // Método getter para obtener el número de contrato
    public int getNoContrato() {
        return noContrato;
    }

    // Método getter para obtener el año del contrato
    public int getAnnio() {
        return annio;
    }

    // Método getter para obtener el horario del contrato
    public String getHorario() {
        return horario;
    }

    // Método getter para obtener el tipo de cargo del contrato
    public Cargos getTipoCargo() {
        return tipoCargo;
    }

    // Método setter para establecer el tipo de cargo del contrato
    public void setTipoCargo(Cargos tipoCargo) {
        this.tipoCargo = tipoCargo;
    }
}
