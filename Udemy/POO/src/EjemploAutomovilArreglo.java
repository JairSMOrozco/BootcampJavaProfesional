import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {
        //Subaru
        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Tanque tanqueSubaru = new Tanque();
        Persona conductorSubaru = new Persona("Lucy", "Martinez");

        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setColor(Color.BLANCO);
        subaru.setMotor(motorSubaru);
        subaru.setTanque(tanqueSubaru);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);

        //Mazda
        Motor mazdaMotor = new Motor(3.0, TipoMotor.DIESEL);
        Tanque mazdaTanque = new Tanque(45);
        Persona conductorMazda = new Persona("Pato", "Rodriguez");

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, mazdaMotor);
        mazda.setTanque(mazdaTanque);
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setConductor(conductorMazda);

        //Nissan
        Motor nissanMotor = new Motor(4, TipoMotor.DIESEL);
        Tanque nissanTanque = new Tanque(50);
        Persona conductorNissan = new Persona("Bea", "Gonzalez");

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS_OSCURO, nissanMotor, nissanTanque);
        nissan.setConductor(conductorNissan);
        nissan.setTipo(TipoAutomovil.PICKUP);

        //Suzuki
        Motor suzukiMotor = new Motor(1.6, TipoMotor.BENCINA);
        Tanque suzukiTanque = new Tanque(50);
        Persona conductorSuzuki = new Persona("Lalo", "Mena");

        Automovil suzuki = new Automovil("Suzuki", "Vitara", Color.GRIS_OSCURO, suzukiMotor, suzukiTanque);
        suzuki.setConductor(conductorSuzuki);
        suzuki.setColor(Color.AMARILLO);
        suzuki.setTipo(TipoAutomovil.SUV);

        //Audi
        Persona conductorAudi = new Persona("Jano", "Perez");

        Automovil audi = new Automovil("Audi", "A3");
        audi.setConductor(conductorAudi);

        //Creando un array de tipo automovil
        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;

        Arrays.sort(autos);
        for (Automovil auto: autos) {
            System.out.println(auto);
        }

    }
}
