import javax.swing.*;
import java.util.Scanner;

public class SistemasNumericos {
    public static void main(String[] args) {

        //Captura de numero por ventana de dialogo
        String numeroString = JOptionPane.showInputDialog(null, "Ingresa un numero entero");

        int numeroDecimal = 0;

        try{
            //Conversión a integer de numero ingresado
            numeroDecimal = Integer.parseInt(numeroString);

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Debes ingresar un numero entero");
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
        JOptionPane.showMessageDialog(null, salida);
    }
}
