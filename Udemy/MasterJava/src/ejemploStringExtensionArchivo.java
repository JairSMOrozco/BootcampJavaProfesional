public class ejemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna.imagen.xml";
        int myIndex = archivo.lastIndexOf(".");
        
        //cantidad de caracteres
        System.out.println("archivo.length() = " + archivo.length());
        
        //Tomar los últimos 4 caracteres
        System.out.println("archivo = " + archivo.substring(myIndex + 1));
    }
}
