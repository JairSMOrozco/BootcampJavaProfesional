public class ConversionDeTipos {
    public static void main(String[] args) {

        //DE STRING A PRIMITIVOS
        String numeroString = "50";

        int numeroInt = Integer.parseInt(numeroString);
        byte numeroByte = Byte.parseByte(numeroString);
        short numeroShort = Short.parseShort(numeroString);

        //Conversion a numeros con punto decimal
        String realString = "98765.43e-3";

        double realDouble = Double.parseDouble(realString);
        float realFLoat = Float.parseFloat(realString);

        //Conversion a boolean
        String logicoTrueString = "true";
        String logicoFalseString = "false";

        boolean logicoBooleanT = Boolean.parseBoolean(logicoTrueString);
        boolean logicoBooleanF = Boolean.parseBoolean(logicoFalseString);

        //DE PRIMITIVOS A STRING
        int otroNUmeroInt = 100;

        String otroNumeroString = Integer.toString(otroNUmeroInt);
        otroNumeroString = String.valueOf(otroNumeroString);

        double otroNUmeroDouble = 12.34567e2;

        otroNumeroString = Double.toString(otroNUmeroDouble);
        otroNumeroString = String.valueOf(otroNUmeroDouble);
        otroNumeroString = String.valueOf(1.23456e2f);

        //DE PRIMITIVO A PRIMITIVO
        int numeroEntero = 7;

        short numeroShort2 = (short) numeroEntero;
        long numeroLong2 = (long) numeroEntero;

        //boolean numeroBoolean = (boolean) numeroEntero;

        char numeroChar2 = (char) numeroEntero;
        System.out.println("numeroChar2 = " + numeroChar2);

    }
}
