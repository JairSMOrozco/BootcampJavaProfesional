public class OperadorAritmetico {
    public static void main(String[] args) {
        int i, j, suma, resta, multi, resto;
        float div;
        i = 5;
        j = 4;

        suma = i + j;
        System.out.println("suma = " + suma);

        resta = i - j;
        System.out.println("resta = " + resta);

        multi = i * j;
        System.out.println("multi = " + multi);

        div = (float) i / (float) j;
        System.out.println("div = " + div);

        resto = i % j;
        System.out.println("resto = " + resto);
    }
}
