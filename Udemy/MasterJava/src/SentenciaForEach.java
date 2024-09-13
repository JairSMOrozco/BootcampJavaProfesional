public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numeroImpares = {1,3,5,7,9,11};

        for(int numero: numeroImpares){
            System.out.println("El numero es: " + numero);
        }

        String[] nombres = {"jair", "karina", "isabel", "juan", "pedro"};

        for(String nombre: nombres){
            String nombreMayuscula = nombre.toUpperCase();
            System.out.println(nombreMayuscula);
        }

    }
}
