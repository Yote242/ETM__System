import java.util.Scanner;
public class Principal {
    public static void  main(String[] args)
    {

        Scanner sc = new Scanner (System.in);
        String opc;
        do {

            System.out.println("\t ******SYSTEM******* \n");
            System.out.println("\t Ingrese Usuario: ");
            String user =sc.nextLine();
            if(user=="YAR"){
                System.out.println("\t Ingrese Contrasennia: \n");
                int password =sc.nextInt();
            }

            System.out.println("Desea Continuar? (S/N): \n");
             opc =sc.nextLine();
        }while ((opc=="S")||(opc=="s"));

    }
}
