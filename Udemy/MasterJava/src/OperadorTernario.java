import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        // variable = condicion ? si es true devuelve esto : si es false devuelve esto

        /*
        String estado = "";
        double promedio = 5.9;

        estado = promedio >= 6 ? "Aprobado" : "Reprobado";

        System.out.println("estado = " + estado);
        */

        Scanner myScanner = new Scanner(System.in);

        String[] materias = {"historia", "ciencias", "matematicas", "geografia", "artes"};
        double[] calificaciones = new double[5];
        String estado = "";

        for(int i = 0; i < materias.length; i++){
            System.out.println("Ingresa la calificación de ".concat(materias[i]));
            calificaciones[i] = myScanner.nextDouble();
        }

        double promedio = (calificaciones[0] + calificaciones[1] + calificaciones[2] + calificaciones[3] + calificaciones[4]) / 5;

        estado = promedio >= 6 ? "Aprobado" : "Reprobado";

        System.out.println(promedio);
        System.out.println(estado);

    }
}
