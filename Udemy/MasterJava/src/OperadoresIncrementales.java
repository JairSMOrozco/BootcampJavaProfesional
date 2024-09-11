public class OperadoresIncrementales {
    public static void main(String[] args) {
        //pre incremento
        int i = 1;
        int j = ++i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //post incremento
        i = 2;
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //pre decremento
        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //post decremento
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //
        System.out.println("j = " + (++j) );// Primero incrementa en 1 y luego imprime valor
        System.out.println("j = " + (j++) );// Primero imprime valor y luego incrementa en 1
        System.out.println("j = " + j); // IMprime valor actual de la variable
    }

}
