import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaTerminal {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        //Captura de numero por terminal
        System.out.println("Ingresa un numero entero");

        //String numeroString = myScanner.nextLine();

        int numeroDecimal = 0;

        try{
            //Conversión a integer de numero ingresado
            numeroDecimal = myScanner.nextInt(); //Integer.parseInt(numeroString);

        }catch (InputMismatchException e){
            System.out.println("Debes ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        //Cadena que contiene el valor de numero decimal
        String numDecimalString = "Numero decimal ingresado = " + numeroDecimal;

        //Cadena que contiene el valor de numero binario
        String numBinarioString = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        //Cadena que contiene el valor de numero octal
        String numOctalString = "Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        //Cadena que contiene el valor de numero hexadecimal
        String numHexadecimalString = "Numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        //Cadena que contiene las 3 cadenas con los valores del numero decimal convertido
        String salida = numDecimalString + "\n" +
                numBinarioString + "\n" +
                numOctalString + "\n" +
                numHexadecimalString;

        //Ventana que muestra el resultado de las conversiones
        System.out.println(salida);
    }
}
