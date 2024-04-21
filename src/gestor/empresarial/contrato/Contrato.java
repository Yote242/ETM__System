package gestor.empresarial.contrato;
import gestor.empresarial.contrato.Cargos;
import gestor.errores.GestionErrores;

public final class Contrato {
    // Declaración de variables miembro de la clase Contrato
    private int id;
    private int NoContrato;
    private int annio;
    private String horario;
    private Cargos tipoCargo; // Tipo de objeto de la clase Cargos

    // Constructor de la clase Contrato que toma un parámetro 'id'
    public Contrato(int id){
        // El constructor está vacío, no realiza ninguna acción al ser invocado
        GestionErrores error = new GestionErrores();
    }

    // Método getter para obtener el número de contrato
    public int getNoContrato() {
        return NoContrato;
    }

    // Método setter para establecer el número de contrato
    public void setNoContrato(int a) {
        NoContrato = a;
    }

    // Método getter para obtener el año del contrato
    public int getAnnio() {
        return annio;
    }

    // Método setter para establecer el año del contrato
    public void setAnnio(int b) {
        this.annio = b;
    }
}
