import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //Pedir datos de persona 1
        System.out.println("Ingresa el nombre de la primera persona");
        String nombre1 = myScanner.nextLine();
        String nombre1_A = nombre1.toUpperCase().charAt(1) + "." + nombre1.substring(nombre1.length() - 2);

        System.out.println("Ingresa el nombre de la segunda persona");
        String nombre2 = myScanner.nextLine();
        String nombre2_A = nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length() - 2);

        System.out.println("Ingresa el nombre de la tercera persona");
        String nombre3 = myScanner.nextLine();
        String nombre3_A = nombre3.toUpperCase().charAt(1) + "." + nombre3.substring(nombre3.length() - 2);

        String nombreFinal = nombre1_A + "_" + nombre2_A + "_" + nombre3_A;

        System.out.println(nombreFinal);
    }
}
