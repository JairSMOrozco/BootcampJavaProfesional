import com.jairorozco.modelo.*;

import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {
        Date fecha = new Date();
        
        IPhone iphone = new IPhone("Blanco", "11 SE", 20499.99, "Apple");
        TvLcd tele = new TvLcd(55, 13499.99, "Samsung");
        Libro libro = new Libro(fecha, "Jair Orozco", "Patrones de diseño", "Planeta", 155.67, 100);
        Comics comic = new Comics("Batman", fecha, "Kirby", "La muerte de Batman", "Panini", 99.99, 50);

        System.out.println(iphone);
        System.out.println(tele);
        System.out.println(libro);
        System.out.println(comic);

    }
}