import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        //Subaru
        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Tanque tanqueSubaru = new Tanque();

        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setColor(Color.BLANCO);
        subaru.setMotor(motorSubaru);
        subaru.setTanque(tanqueSubaru);

        //Mazda
        Motor mazdaMotor = new Motor(3.0, TipoMotor.DIESEL);
        Tanque mazdaTanque = new Tanque(45);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, mazdaMotor);
        mazda.setTanque(mazdaTanque);

        //Nissan
        Motor nissanMotor = new Motor(4, TipoMotor.DIESEL);
        Tanque nissanTanque = new Tanque(50);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS_OSCURO, nissanMotor);
        nissan.setTanque(nissanTanque);

        //Nissan 2
        Motor nissan2Motor = new Motor(3.5, TipoMotor.BENCINA);
        Tanque nissan2Tanque = new Tanque(50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS_OSCURO, nissan2Motor);
        nissan2.setTanque(nissan2Tanque);

        //Auto
        Automovil auto = new Automovil();

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

        System.out.println(nissan.toString());
    }
}
