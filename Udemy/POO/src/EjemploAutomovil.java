import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setColor("Blanco");
        subaru.setCilindrada(2.0);

        Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0);

        Automovil nissan = new Automovil("Nissan", "Navara", "Gris Oscuro", 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris Oscuro", 3.5, 50);
        Automovil auto = new Automovil();
        Date fecha = new Date();

        System.out.println(subaru.detalle());
        System.out.println(subaru.acelerarFrenar(3000));
        System.out.println("Kilometros por litro " + subaru.calcularConsumo(300, 0.6f));

        System.out.println(mazda.detalle());
        System.out.println(mazda.acelerarFrenar(4000));
        System.out.println("Kilometros por litro " + mazda.calcularConsumo(300, 60));

        System.out.println(nissan.detalle());
        System.out.println(nissan.acelerarFrenar(4000));
        System.out.println("Kilometros por litro " + nissan.calcularConsumo(300, 60));

        System.out.println( "\nEs igual: " + (nissan == nissan2) );
        System.out.println( "\nEs igual: " + (nissan.equals(nissan2)) );
        System.out.println("\nEs igual: " + auto.equals(nissan));
        System.out.println("\nEs igual: " + auto.equals(fecha));

        System.out.println(nissan.toString());
    }
}
