public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Jair Orozco";
        String detalle = curso + " con el profesor " +  profesor;

        int a = 10;
        int b = 5;

        System.out.println(detalle + " " + (a + b));
    }
}
