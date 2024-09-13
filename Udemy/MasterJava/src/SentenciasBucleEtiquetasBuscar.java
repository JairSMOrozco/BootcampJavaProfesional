public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        /*
        //Buscar cuantas veces se repite un caracter en una frase

        String frase = "tres tristes tigres tragan trigo en un trigal";
        int maxCaracteres = frase.length();
        int contador = 0;

        for(int i = 0; i < maxCaracteres; i++){
            if( (frase.charAt(i) != 't') ) {
                continue;
            }
            contador++;
        }

        System.out.println("Hay " + contador + " t en la frase");
        */

        //Buscar cuantas veces se repite una palabra en una frase

        //Definir una frase y una palabra a buscar
        String frase = "tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";

        //Extensión de la frase y de la palabra
        int extensionFrase = frase.length();
        int extensionPalabra = palabra.length();

        //Contador de cuantas veces se repite la palabra
        int contadorPalabra = 0;

        //For que recorre la frase
        buscar:
        for (int i = 0; i < extensionFrase; i++){
            int k = i;

            for(int j = 0; j < extensionPalabra; j++){
                if(frase.charAt(k++) != palabra.charAt(j)){
                    continue buscar;
                }
            }

            contadorPalabra++;

        }

        //Impresion de la cantidad de veces que se repitió la palabra
        System.out.println("La palabra " + palabra + " se repitió " + contadorPalabra + " veces");

    }
}
