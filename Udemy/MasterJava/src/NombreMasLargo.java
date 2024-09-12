import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {
        String max = "";
        //Pido nombres
        String nombreFamiliar1 = JOptionPane.showInputDialog(null,"Ingresa tu nombre completo");
        String nombreFamiliar2 = JOptionPane.showInputDialog(null,"Ingresa tu nombre completo");
        String nombreFamiliar3 = JOptionPane.showInputDialog(null,"Ingresa tu nombre completo");

        //Convierto los nombres a un arreglo
        String[] nombre1 = nombreFamiliar1.split(" ");
        String[] nombre2 = nombreFamiliar2.split(" ");
        String[] nombre3 = nombreFamiliar3.split(" ");

        //Saco la extensión de los nombres en caracteres
        int nombreCaracteresFamiliar1 = nombre1[0].length();
        int nombreCaracteresFamiliar2 = nombre2[0].length();
        int nombreCaracteresFamiliar3 = nombre3[0].length();

        //Busco que nombre tiene el mayor número de caracteres y se asigna a max el nombre completo de la persona
        max = (nombreCaracteresFamiliar1 > nombreCaracteresFamiliar2) ? nombreFamiliar1 : nombreFamiliar2;
        int maxCaracteres1_2  = (nombreCaracteresFamiliar1 > nombreCaracteresFamiliar2) ? nombreCaracteresFamiliar1 : nombreCaracteresFamiliar2;

        max = (maxCaracteres1_2 > nombreCaracteresFamiliar3) ? max : nombreFamiliar3;

        System.out.println(max + " tiene el nombre más largo");
    }
}
