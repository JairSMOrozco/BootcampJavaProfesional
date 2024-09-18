import java.util.Date;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        //Subaru
        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Tanque tanqueSubaru = new Tanque();
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setColor(Color.BLANCO);
        subaru.setMotor(motorSubaru);
        subaru.setTanque(tanqueSubaru);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        //Mazda
        Motor mazdaMotor = new Motor(3.0, TipoMotor.DIESEL);
        Tanque mazdaTanque = new Tanque(45);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, mazdaMotor);
        mazda.setTanque(mazdaTanque);
        mazda.setTipo(TipoAutomovil.PICKUP);

        //Nissan
        Motor nissanMotor = new Motor(4, TipoMotor.DIESEL);
        Tanque nissanTanque = new Tanque(50);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS_OSCURO, nissanMotor);
        nissan.setTanque(nissanTanque);
        nissan.setTipo(TipoAutomovil.PICKUP);

        //Nissan2
        Motor nissan2Motor = new Motor(3.5, TipoMotor.BENCINA);
        Tanque nissan2Tanque = new Tanque(50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS_OSCURO, nissan2Motor);
        nissan2.setTanque(nissan2Tanque);
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.PICKUP);

        //Auto
        Automovil auto = new Automovil();

        Automovil.setColorPatente(Color.AZUL);

        System.out.println(subaru.detalle());
        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println(tipoSubaru);

        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println(nissan2.detalle());


        Automovil.setCapacidadTanqueEstatico(35);
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilometros por litro: " + Automovil.calcularConsumoEstatico(300, 60));
        System.out.println("Velocidad máxima carretera = " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad máxima ciudad = " + Automovil.VELOCIDAD_MAX_CIUDAD);
    }
}
