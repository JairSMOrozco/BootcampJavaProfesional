import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        //Constantes
        final double IMPUESTO = .19;

        //Instancias
        Scanner myScanner = new Scanner(System.in);

        //Recibiendo datos
        System.out.println("Ingrese el nombre o descripción de la factura");
        String nombreFactura = myScanner.nextLine();

        System.out.println("Ingrese precio 1");
        double precio1 = myScanner.nextDouble();

        System.out.println("Ingrese precio 2");
        double precio2 = myScanner.nextDouble();

        double totalSinImpuesto = precio1 + precio2;
        double totalImpuestoACobrar = totalSinImpuesto * IMPUESTO;
        double totalConImpuesto = totalSinImpuesto + totalImpuestoACobrar;

        System.out.println("La factura " + nombreFactura + " tiene un total bruto de " + totalSinImpuesto + "\n" +
                            "con un impuesto de " + totalImpuestoACobrar + "\n" +
                            "y el monto después de impuesto es de " + totalConImpuesto );

    }
}
