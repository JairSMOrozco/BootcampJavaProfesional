public class EjemploAutomovilEnum {
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

        //Impresion de objetos
        System.out.println(subaru.detalle());
        TipoAutomovil tipo = subaru.getTipo();
        //System.out.println(tipo);
        switch (tipo){
            case CONVERTIBLE -> System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
            case FURGON -> System.out.println("Es un automovil utilitario de transporte de empresas");
            case HATCHBACK -> System.out.println("Es un automovil mediano compacto con aspecto deportivo");
            case PICKUP -> System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN -> System.out.println("Es un automovil mediano");
            case STATION_WAGON -> System.out.println("Es un automovil más grande, con maleta grande");
        }

        System.out.println(mazda.detalle());
        tipo = mazda.getTipo();
        switch (tipo){
            case CONVERTIBLE -> System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
            case FURGON -> System.out.println("Es un automovil utilitario de transporte de empresas");
            case HATCHBACK -> System.out.println("Es un automovil mediano compacto con aspecto deportivo");
            case PICKUP -> System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN -> System.out.println("Es un automovil mediano");
            case STATION_WAGON -> System.out.println("Es un automovil más grande, con maleta grande");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for(TipoAutomovil tiposAutomoviles: tipos){
            System.out.println(tiposAutomoviles);
        }


    }
}
