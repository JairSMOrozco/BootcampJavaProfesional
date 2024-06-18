public class IntroJava_Clase_1 {

    //Método Principal
    public static void main(String [] args) {

        System.out.println("¡Hola!"); //Impresión

        //Primitiva - SOLO GUARDAR valor
        int miEntero; //Declarando la variable
        miEntero = 400; // Asignando un valor
        double pi = 3.141592; //Declarar la variable y asignarle un valor
        boolean bool = true; //true o false
        char unCaracter = 'a'; //Un caracter

        //Objeto -> Métodos que ayudan a manipular
        Integer myInteger = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        String myString = "ABC";

        System.out.println(myString);

        //Cadenas - Strings
        String cadena = "Buenas tardes a todos mis Compañeros";
        System.out.println("Cantidad de caracteres:"+cadena.length());

        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());

        String x = "Hola";
        String y = "hola";
        System.out.println(x.equals(y)); //Case Sensitive

        //CONDICIONALES
        double otroDouble = 400.00;
        if(miEntero == otroDouble) { //== != > >= < <=
            System.out.println("Numeros iguales");
        } else {
            System.out.println("Numeros distintos");
        }

        int edadInfante = 4;
        if(edadInfante < 2) {
            System.out.println("El infante es un bebe");
        } else if(edadInfante <= 4) {
            System.out.println("El infante es un toddler");
        }else {
            System.out.println("El infante es un niño");
        }

        boolean llueve = false;
        int temperatura = 20;
        if(temperatura >= 18 && !llueve) {
            System.out.println("Es un gran día pasa un paseo en el parque");
        }

        int edad = 16;
        boolean permisoPadres = true;
        if(edad > 18 || permisoPadres) { //O una u otra condicional se cumple
            System.out.println("Puedes obtener tu licencia de conducir");
        }

        //BUCLES
        /*
        i = 0
        alo?
        i = 1
        alo?
        i = 2
        alo?
        i = 3
        alo?
        i = 4
        alo?
        i = 5
        alo?
        i = 6
        alo?
        i = 7
         */
        int i = 0;
        for(; i<7; i++) { //i+=2 para aumentar de 2 en 2
            System.out.println("alo?");
        }

        int inicio = 0;
        int fin = 10;
        /*
        inicio = 0
        fin = 10
        hola?
        inicio = 1
        fin = 8
        -----
        hola?
        inicio = 2
        fin = 6
        -----
        hola?
        inicio = 3
        fin = 4
        -----
        hola?
        inicio = 4
        fin = 2
         */
        while(inicio < fin) {
            System.out.println("hola?");
            inicio++;
            fin -= 2; //fin = fin-2;
        }

        int num1 = 10;
        int num2 = 9;
        do {
            System.out.println("Entro?");
        } while (num1 < num2);

        /* ARRAYS o ARREGLOS */
        int[] miArreglo; //Declaración
        miArreglo = new int[5]; //Inicialización
        miArreglo[0] = 4;
        miArreglo[1] = 8;
        miArreglo[2] = 8;
        miArreglo[3] = 5;
        miArreglo[4] = 9;

        int[] miArreglo2 = {4, 8, 8, 5, 9};
        System.out.println(miArreglo[3]);
        System.out.println(miArreglo2[4]);

        //OJO: En un array, una vez establecido el tamaño NO puede ser alterado. En caso de requerir algo más dinámico ArrayList

        //¿Cómo recorren un array?
        /*

         */
        for(int indice=0; indice < miArreglo.length; indice++) {
            System.out.print(miArreglo[indice]);
        }

        System.out.println(miArreglo[miArreglo.length-1]);

        saludo();
        saludo();
        saludo();

        saludo("Elena de Troya");

    }

    /*
    Permisos funcion-> public, private, protected
    static -> De clase (Detalle en OOP)
    Tipo de valor de retorno -> String, int, double. No regresa nada: void
    nombre de funcion
    (argumentos)
     */
    public static void saludo(){
        System.out.println("¡Hola mundo!");
    }

    /* SOBRECARGA */
    public static void saludo(String nombre) {
        System.out.println("Hola "+nombre);
    }


}
