public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {
        //Subaru
        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Tanque tanqueSubaru = new Tanque();
        Persona conductorSubaru = new Persona("Lucy", "Martinez");
        Rueda[] ruedasSubaru = new Rueda[5];


        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setColor(Color.BLANCO);
        subaru.setMotor(motorSubaru);
        subaru.setTanque(tanqueSubaru);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        for(int i = 0; i < ruedasSubaru.length; i++){
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }
        //subaru.setRuedas(ruedasSubaru);


        //Mazda
        Motor mazdaMotor = new Motor(3.0, TipoMotor.DIESEL);
        Tanque mazdaTanque = new Tanque(45);
        Persona conductorMazda = new Persona("Pato", "Rodriguez");
        Rueda[] ruedasMazda = new Rueda[5];


        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, mazdaMotor);
        mazda.setTanque(mazdaTanque);
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setConductor(conductorMazda);
        for(int i = 0; i < ruedasMazda.length; i++){
            mazda.addRueda(new Rueda("Michellin", 18, 10.5));
        }
        //mazda.setRuedas(ruedasMazda);

        //Nissan
        Motor nissanMotor = new Motor(4, TipoMotor.DIESEL);
        Tanque nissanTanque = new Tanque(50);
        Persona conductorNissan = new Persona("Bea", "Gonzalez");

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS_OSCURO, nissanMotor, nissanTanque);
        nissan.setConductor(conductorNissan);
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5));

        //Nissan2
        Motor nissan2Motor = new Motor(3.5, TipoMotor.BENCINA);
        Tanque nissan2Tanque = new Tanque(50);
        Persona conductorNissan2 = new Persona("Lalo", "Mena");
        Rueda[] ruedasNissan2 = {new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
        };

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS_OSCURO, nissan2Motor, nissan2Tanque, conductorNissan2, ruedasNissan2);
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
