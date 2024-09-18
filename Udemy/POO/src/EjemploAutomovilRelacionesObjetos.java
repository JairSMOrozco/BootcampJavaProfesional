public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {
        //Subaru
        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Tanque tanqueSubaru = new Tanque();
        Persona conductorSubaru = new Persona("Lucy", "Martinez");
        Rueda[] ruedasSubaru = new Rueda[5];
        ruedasSubaru[0] = new Rueda("Yokohama", 16, 7.5);
        ruedasSubaru[1] = new Rueda("Yokohama", 16, 7.5);
        ruedasSubaru[2] = new Rueda("Yokohama", 16, 7.5);
        ruedasSubaru[3] = new Rueda("Yokohama", 16, 7.5);
        ruedasSubaru[4] = new Rueda("Yokohama", 16, 7.5);

        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setColor(Color.BLANCO);
        subaru.setMotor(motorSubaru);
        subaru.setTanque(tanqueSubaru);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        subaru.setRuedas(ruedasSubaru);

        //Mazda
        Motor mazdaMotor = new Motor(3.0, TipoMotor.DIESEL);
        Tanque mazdaTanque = new Tanque(45);
        Persona conductorMazda = new Persona("Pato", "Rodriguez");
        Rueda[] ruedasMazda = {new Rueda("Michellin", 18, 10.5),
                                new Rueda("Michellin", 18, 10.5),
                                new Rueda("Michellin", 18, 10.5),
                                new Rueda("Michellin", 18, 10.5),
                                new Rueda("Michellin", 18, 10.5)};

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, mazdaMotor);
        mazda.setTanque(mazdaTanque);
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setConductor(conductorMazda);
        mazda.setRuedas(ruedasMazda);

        //Nissan
        Motor nissanMotor = new Motor(4, TipoMotor.DIESEL);
        Tanque nissanTanque = new Tanque(50);
        Persona conductorNissan = new Persona("Bea", "Gonzalez");

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS_OSCURO, nissanMotor, nissanTanque, conductorNissan, null);
        nissan.setTipo(TipoAutomovil.PICKUP);


        //Nissan2
        Motor nissan2Motor = new Motor(3.5, TipoMotor.BENCINA);
        Tanque nissan2Tanque = new Tanque(50);
        Persona conductorNissan2 = new Persona("Lalo", "Mena");

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS_OSCURO, nissan2Motor, nissan2Tanque, conductorNissan2, null);
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.PICKUP);

        //Auto
        Automovil auto = new Automovil();

        Automovil.setColorPatente(Color.AZUL);

        //Impresion de objetos
        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println(nissan2.detalle());

    }
}
