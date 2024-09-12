import java.util.Scanner;

public class Ordenar2Numeros {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int max = 0;

        System.out.println("Ingresa un número");
        int num1 = myScanner.nextInt();

        System.out.println("Ingresa un segundo número");
        int num2 = myScanner.nextInt();

        max = (num1 > num2) ? num1 : num2;

        String mensaje = max != num1 ? "Mayor: " + num2 + "\n" + "Menor: " + num1 : "Mayor: " + num1 + "\n" + "Menor: " + num2;

        System.out.println(mensaje);
    }
}
