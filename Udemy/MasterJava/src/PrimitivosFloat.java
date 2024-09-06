public class PrimitivosFloat {
    public static void main(String[] args) {
        //Float
        float numeroFloat = 2.12e3F;// = 2120.0F;
        float numeroFloat2 = 1.5e4F;// = 15000.0F;
        float numeroFloat3 = 1.5e-5F;// = 0.000015F;

        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo float corresponde en bits a " + Float.SIZE);
        System.out.println("valor maximo de un float: " + Float.MAX_VALUE);
        System.out.println("valor minimo de un float: " + Float.MIN_VALUE);

        System.out.println("\n");

        double numeroDouble = 3.4028235E38D;// = 2120.0F;

        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("tipo double corresponde en bits a " + Double.SIZE);
        System.out.println("valor maximo de un double: " + Double.MAX_VALUE);
        System.out.println("valor minimo de un double: " + Double.MIN_VALUE);
    }
}
