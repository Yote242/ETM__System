import java.util.Scanner;

import gestor.empresarial.datos.DatosPersonales;
import gestor.empresarial.empleados.Empleados;
import gestor.errores.*;
public class Principal {
    public static void  main(String[] args)
    {
        GestionErrores gestionErrores = new GestionErrores();
        DatosPersonales datosPersonales= new DatosPersonales();


        Scanner sc = new Scanner (System.in);
        String opc;
        do {

            System.out.println("\t ******SYSTEM******* \n");
            System.out.println("\t Ingrese Usuario: ");
            String user =sc.nextLine();
            if(user.equals("YAR")){
                System.out.println("\t Ingrese Contrasennia: \n");
                String password =sc.nextLine();
                if (password.equals("yar1204")){

                }
                else {
                    String mensaje = gestionErrores.getDescripcionTecnica(2);
                }
            }
            else {
                System.out.println("Usuario Incorrecto ");
                String mensaje = gestionErrores.getDescripcionTecnica(2);
            }

            System.out.println("Desea Continuar? (S/N): \n");
             opc =sc.nextLine();
        }while ((opc.equals("S"))||(opc.equals("s")));

        System.out.println("\t Datos personales");
        System.out.println("\t Ingrese los datos");
        System.out.println("\t Nombre: ");
        String data =sc.nextLine();
        System.out.println("\t apellido: ");
        String data2 =sc.nextLine();
        System.out.println("\t correo: ");
        String data3 =sc.nextLine();
        System.out.println("\t WhatsApp: ");
        String data4 =sc.nextLine();






    }
}
