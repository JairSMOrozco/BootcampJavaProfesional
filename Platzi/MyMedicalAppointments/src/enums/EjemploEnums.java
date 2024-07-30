package enums;
public class EjemploEnums {
    public static void main(String[] args) {
        //Imprimir un valor del enum
        //EstacionesAnio estacion = EstacionesAnio.PRIMAVERA;
        //System.out.println("Estacion: " + estacion);


        //Imprimir todos los valores de un enum y sus atributos
        //Se almacenan en una variable del tipo del enum los valores
        EstacionesAnio[] estaciones = EstacionesAnio.values();

        //Se recorre el arreglo con un for y se imprimen los valores
        for (int i = 0; i < estaciones.length; i++){
            System.out.println("Estacion: " + estaciones[i].name());
            System.out.println("Descripcion: " + estaciones[i].getDescripcion());
            System.out.println("Meses: " + estaciones[i].getMesesEstacion());
        }

    }
}
