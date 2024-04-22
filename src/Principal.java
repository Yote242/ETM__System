
import java.util.Scanner;
import gestor.empresarial.contrato.Contrato;
import gestor.empresarial.contrato.Cargos;
import gestor.empresarial.datos.DatosPersonales;
import gestor.empresarial.datos.DatosEmpresariales;
import gestor.empresarial.empleados.Empleados;
import gestor.errores.*;

public class Principal {
    public static void  main(String[] args) {
        GestionErrores gestionErrores = new GestionErrores();
        DatosPersonales datosPersonales = null;
        DatosEmpresariales datosEmpresariales;
        Contrato contrato;
        Cargos cargos;

        Empleados empleados = new Empleados();

        Scanner sc = new Scanner(System.in);
        String opc, opcCont;

        do {
            System.out.println("\t\t******SYSTEM******* \n");
            System.out.println("\t Ingrese Usuario: ");
            String user = sc.nextLine();

            if (user.equals("YAR")) {
                System.out.println("\t Ingrese Contrasennia: \n");
                String password = sc.nextLine();

                if (password.equals("yar1204")) {
                    System.out.println("Acceso Autorizado \n");

                    do {
                        System.out.println("\t\t************MENU************\n");
                        System.out.println("Datos Personales  \t | OPC(1)");
                        System.out.println("Datos Empresariales\t | OPC(2)");
                        System.out.println("Contrato            \t | OPC(3)");
                        System.out.println("Seleccione una opcion: ");
                        int opcMen = sc.nextInt();

                        switch (opcMen) {
                            case 1:
                                System.out.println("\t Datos personales \n");
                                System.out.println("\t Ingrese los datos \n");
                                System.out.println("\t Id: ");
                                int id = sc.nextInt();
                                sc.nextLine(); // Consumir el salto de línea

                                try {
                                    System.out.println("\t Nombre: ");
                                    String nombre = sc.nextLine();

                                    System.out.println("\t apellido: ");
                                    String data2 = sc.nextLine();

                                    System.out.println("\t correo: ");
                                    String data3 = sc.nextLine();

                                    System.out.println("\t WhatsApp: ");
                                    String data4 = sc.nextLine();

                                    datosPersonales = new DatosPersonales(id, nombre, data2, data3, data4);
                                    empleados.addDatosPersonales(datosPersonales);
                                } catch (NumberFormatException e) {
                                    String mensaje = gestionErrores.getDescripcionTecnica(5);
                                }
                                break;

                            case 2:
                                System.out.println("\t Datos Empresariales\n");
                                System.out.println("Ingere el ID del empleado");
                                int idEmp = sc.nextInt();

                                try {
                                    if (idEmp == datosPersonales.getId()) {
                                        System.out.println("Trabajador Encontrado: " + idEmp);
                                        System.out.println("Ingrese un Telefono Exterior");
                                        String telExte = sc.nextLine();

                                        System.out.println("Ingrese la Adscripcio:");
                                        String adscripcion = sc.nextLine();

                                        System.out.println("Ingrese el Puesto");
                                        String puesto = sc.nextLine();

                                        datosEmpresariales = new DatosEmpresariales(telExte, adscripcion, puesto);
                                        empleados.addDatosEmpresariales(datosEmpresariales);
                                    } else {
                                        System.out.println("El id no existe");
                                        String mensaje = gestionErrores.getDescripcionTecnica(4);
                                    }
                                } catch (NumberFormatException e) {
                                    String mensaje = gestionErrores.getDescripcionTecnica(5);
                                }
                                break;

                            case 3:
                                System.out.println("\t CONTRATO");
                                System.out.println("Introduzca el ID a buscar del empleado:");
                                int idCon = sc.nextInt();

                                try {
                                    if (idCon == datosPersonales.getId()) {
                                        System.out.println("Ingrese el numero de contrato: ");
                                        int folio = sc.nextInt();

                                        System.out.println("Ingrese el annio");
                                        int annio = sc.nextInt();

                                        sc.nextLine(); // Consumir el salto de línea

                                        System.out.println("Ingrese la hora de registro");
                                        String hora = sc.nextLine();

                                        System.out.println("Tipo de cargo: (confianza,sindicalizado,temporal) ");
                                        String tipoCargoStr = sc.nextLine();

                                        Cargos tipoCargo = null;
                                        try {
                                            tipoCargo = Cargos.valueOf(tipoCargoStr.toUpperCase());
                                        } catch (IllegalArgumentException e) {
                                            System.out.println("Tipo de cargo no válido.");
                                            return; // Terminar la ejecución del programa si el tipo de cargo no es válido
                                        }

                                        contrato = new Contrato(folio, annio, hora, tipoCargo);
                                    } else {
                                        System.out.println("El id no existe");
                                        String mensaje = gestionErrores.getDescripcionTecnica(4);
                                    }
                                } catch (NumberFormatException e) {
                                    String mensaje = gestionErrores.getDescripcionTecnica(5);
                                }
                                break;

                            default:
                                System.out.println("Opcion del menu incorrecta");
                                String mensaje = gestionErrores.getDescripcionTecnica(1);

                                System.out.println("Desea continuar en el MENU (S/N): ");
                                opcCont = sc.nextLine();
                        }
                        System.out.println("Desea continuar en el MENU (S/N): ");
                        opcCont = sc.nextLine();
                    } while ((opcCont.equals("s")) || (opcCont.equals("S")));
                } else {
                    String mensaje = gestionErrores.getDescripcionTecnica(2);
                }
            } else {
                System.out.println("Usuario Incorrecto ");
                String mensaje = gestionErrores.getDescripcionTecnica(2);
            }

            System.out.println("Desea Continuar? (S/N): \n");
            opc = sc.nextLine();
        } while ((opc.equals("S")) || (opc.equals("s")));
    }
}

