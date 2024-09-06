public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        char simbolo = '@';

        char espacio = ' ';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';


        System.out.println(caracter);
        System.out.println(decimal);
        System.out.println(simbolo);
        System.out.println("decimal = caracter : " + (decimal == caracter));
        System.out.println("simbolo = caracter : " + (simbolo == caracter));

        System.out.println("caracter = " + caracter);
        System.out.println("tipo caracter corresponde en byte a" + espacio + Character.BYTES);
        System.out.println("tipo caracter corresponde en bits a " + Character.SIZE);
        System.out.println("valor maximo de un caracter: " + Character.MAX_VALUE);
        System.out.println("valor minimo de un caracter: " + Character.MIN_VALUE);
    }
}
