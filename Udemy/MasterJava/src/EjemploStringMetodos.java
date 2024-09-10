public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "JairOrozco";
        
        //Length -> Saber el largo de la cadena
        System.out.println("nombre.length() = " + nombre.length());
        
        //Convertir a mayúsculas. Retorna una nueva instancia del String original
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        
        //Convertir a minúsculas. Retorna una nueva instancia del String original
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        
        //Comparar un string con otro a nivel de valor 
        System.out.println("nombre.equals(\"JairOrozco\") = " + nombre.equals("JairOrozco"));
        System.out.println("nombre.equals(\"jairorozco\") = " + nombre.equals("jairorozco"));
        
        //Comparar un string con otro a nivel de valor ignorando el CASE
        System.out.println("nombre.equalsIgnoreCase(\"Jairorozco\") = " + nombre.equalsIgnoreCase("Jairorozco"));
        
        //Comparar caracteres, esta comparación es a nivel valor de tabla UNICODE
        System.out.println("nombre.compareTo(\"JairOrozco\") = " + nombre.compareTo("JairOrozco"));
        System.out.println("nombre.compareTo(\"KarinaTadeo\") = " + nombre.compareTo("KarinaTadeo"));
        
        //charArt -> Es convertir un string en un array de caracteres para luego obtener uno por el índice
        //Retorna una nueva instancia del String original
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); //Primer caracter
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1)); //Segundo caracter
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1));
        
        //substring -> Permite obtener de la cadena original una subcadena desde donde le indiquemos
        //Retorna una nueva instancia del String original
        System.out.println("nombre.substring(3) = " + nombre.substring(3));
        System.out.println("nombre.substring(1,6) = " + nombre.substring(1,6));
        System.out.println("nombre.substring(4, nombre.length() - 1) = " + nombre.substring(4, nombre.length() - 1));
        System.out.println("nombre.substring(nombre.length() - 1) = " + nombre.substring(nombre.length() - 1));
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas);

        //Replace ->  cambia un caracter por otro. Retorna una nueva instancia del String original
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));

        //indexOf -> Permite saber si hay cierto caracter en el string y regresa el index de la primera incidencia
        //Si el valor no se encuentra el método regresa un -1
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));


        //lastIndexOf -> Permite saber si hay cierto caracter en el string y regresa el index de la última incidencia
        //Si el valor no se encuentra el método regresa un -1
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));

        //contains() -> Permite saber si una secuencia de caracteres están en el string. Devuelve un boolean
        System.out.println("trabalenguas.contains(\"uas\") = " + trabalenguas.contains("uas"));

        //startsWith -> Permite saber si un string inicia con cierta cadena de caracteres. Devuelve un boolean
        System.out.println("trabalenguas.startsWith(\"t\") = " + trabalenguas.startsWith("tra"));

        //endsWith -> Permite saber si un string termina con cierta cadena de caracteres. Devuelve un boolean
        System.out.println("trabalenguas.endsWith(\"uas\") = " + trabalenguas.endsWith("uas"));

        //trim -> quita espacios del inicio y del final
        System.out.println("    trabalenguas   ".trim());

    }
}
