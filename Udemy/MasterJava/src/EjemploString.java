public class EjemploString {
    public static void main(String[] args) {
        String curso = "ProgramacionJava";
        String curso2 = new String("programacionjava");

        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual = " + esIgual);

        String curso3 = "ProgramacionJava";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);
    }
}
