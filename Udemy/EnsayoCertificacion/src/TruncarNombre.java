

public class TruncarNombre {
    public static void main(String[] args) {
        //Cadena que hay que truncar a 5 primeros caracteres
        String firstName = "Christopher";
        //SE trunca la cadena con el método substring del tipo de dato String
        firstName = firstName.substring(0,5);

        //Se guarda en una variable la cadena formateada
        //El formato sigue la estructura de C, primero el formato de salida
        //Luego los parámetros.
        String output = String.format("Resultado: %s tiene %d caracteres", firstName, firstName.length());

        System.out.println(output);
        System.out.println((2+3)*4-1);
        System.out.println(4*4+2*5);
        System.out.println(5 / 2 - 4 % 2);
        System.out.println(8 * 2 % 3);

        // Account account = new Account();
        // account.displayTerms();

        //Account.displayTerms()
    }
}
