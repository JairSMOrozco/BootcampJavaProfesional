public class OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        boolean b1 = i == j; //false
        System.out.println("b1 = " + b1);

        boolean b2 = !b1; // true --> Estoy negando el false = true
        System.out.println("b2 = " + b2);

        boolean b3 = i != j; // true --> i si es distinto de j
        System.out.println("b3 = " + b3);

        boolean b4 = m == true; // false
        System.out.println("b4 = " + b4);

        boolean b5 = m != true; //true
        System.out.println("b5 = " + b5);

        boolean b6 = i > j; //false
        System.out.println("b6 = " + b6);

        boolean b7 = i < j; // true
        System.out.println("b7 = " + b7);

        boolean b8 = l >= k; // true
        System.out.println("b8 = " + b8);

        boolean b9 = l <= k; //false
        System.out.println("b9 = " + b9);
    }
}
