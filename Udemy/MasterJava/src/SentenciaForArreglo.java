import javax.swing.*;
import javax.swing.text.html.Option;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Jair", "Maria", "Karina", "Isabel", "Jorge", "Pedro", "Tania"};

        int extensionNombres = nombres.length;

        /*
        for (int i = 0; i < extensionNombres; i++){
            if (nombres[i].toLowerCase().equals("Jair".toLowerCase()) || nombres[i].toLowerCase().equals("Tania".toLowerCase())) {
                continue;
            }
            System.out.println(i + ".- " + nombres[i]);
        }
        */

        String buscarNombre = JOptionPane.showInputDialog("Ingresa un nombre");
        boolean nombreEncontrado = false;

        for (int i = 0; i < extensionNombres; i++){
            if (nombres[i].equalsIgnoreCase(buscarNombre)){
                nombreEncontrado = true;
                break;
            }
            //System.out.println(nombres[i]);
        }

        if (nombreEncontrado){
            JOptionPane.showMessageDialog(null, buscarNombre + " fue encontrado");
        }else {
            JOptionPane.showMessageDialog(null, buscarNombre + " no existe en la lista de nombres");
        }

    }
}
