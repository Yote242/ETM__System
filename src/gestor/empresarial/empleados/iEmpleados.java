// Definición del paquete gestor.empresarial.empleados
package gestor.empresarial.empleados;

// Definición de la interfaz iEmpleados en el paquete gestor.empresarial.empleados
interface iEmpleados {
    // Método para obtener información de un empleado
    public Object getInfoEmpleado(int a);

    // Método para obtener información de un empleado
    public String getInfoEmpleado(String b);

    // Método para mostrar los datos de un empleado
    public void showDatosEmpleado();

    // Método para obtener la antigüedad de un empleado
    public int getAntiguedad(int a);
}