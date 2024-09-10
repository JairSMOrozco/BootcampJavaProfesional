public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        /*
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());

        //Convertir el String a array con toCharArray()
        char[] arrayTrabalenguas = trabalenguas.toCharArray();

        for (int i = 0; i < trabalenguas.length(); i++){
            System.out.println(arrayTrabalenguas[i]);
        }

        String[] arregloSplit = trabalenguas.split("a");

        for(int i = 0; i < arregloSplit.length; i++){
            System.out.println(arregloSplit[i]);
        }
        */

        String archivo = "cualquier.imagen.pdf";
        String[] arrayExtension = archivo.split("\\.");

        for(int i = 0; i < arrayExtension.length; i++){
            System.out.println(arrayExtension[i]);
        }

        System.out.println("La extensión es: " + arrayExtension[arrayExtension.length - 1]);

    }
}
