import java.util.Scanner;

public class NumeroMenor10Numeros {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("¿Cuántos numeros vas a comparar?");
        int cantidadNumeros = myScanner.nextInt();

        if(cantidadNumeros < 10 ){
            System.out.println("NO puedes comparar menos de 10 números");
        }else{
            int numeroMenor = Integer.MAX_VALUE;
            int numero;

            for (int i = 0; i <  cantidadNumeros; i++){
                System.out.println("Ingresa el número " + (i + 1) + ":" );
                numero = myScanner.nextInt();
                numeroMenor = Math.min(numero, numeroMenor);
            }

            System.out.println("El número menor de los datos ingresados es : " + numeroMenor);

            if (numeroMenor < 10){
                System.out.println("El numero " + numeroMenor + " es menor a 10");
            }else {
                System.out.println("El numero " + numeroMenor + " es mayor a 10");
            }
        }
    }
}
