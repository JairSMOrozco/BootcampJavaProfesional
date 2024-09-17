import java.util.Date;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setColor("Blanco");
        subaru.setCilindrada(2.0);

        Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0);
        Automovil nissan = new Automovil("Nissan", "Navara", "Gris Oscuro", 3.5, 50);

        Automovil auto = new Automovil();

        Automovil.setColorPatente("Verde");

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
    }
}
