import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //Capacidad máxima del tanque
        int maxCapacity = 70;

        System.out.println("Ingresa el nivel del tanque de gasolina");
        double currentLevel = myScanner.nextDouble();

        String resultado = currentLevel == 70 ? "Tanque lleno" :
                currentLevel >= 60 && currentLevel < 70 ? "Tanque casi lleno" :
                        currentLevel >= 40 && currentLevel < 60 ? "Tanque 3/4" :
                                currentLevel >= 35 && currentLevel < 40 ? "Medio tanque" :
                                        currentLevel >= 20 && currentLevel < 35 ? "Suficiente" :
                                                currentLevel >= 1 && currentLevel < 20 ? "Insuficiente" :
                                                        "Medida incorrecta, prueba de nuevo";
        System.out.println(resultado);
        /*
        if(currentLevel == maxCapacity){
            System.out.println("Tanque lleno");
        } else if(currentLevel >= 60 && currentLevel < 70){
            System.out.println("Tanque casi lleno");
        }else if(currentLevel >= 40 && currentLevel < 60){
            System.out.println("Tanque 3/4");
        }else if(currentLevel >= 35 && currentLevel < 40){
            System.out.println("Medio tanque");
        }else if(currentLevel >= 20 && currentLevel < 35){
            System.out.println("Suficiente");
        }else if(currentLevel >= 1 && currentLevel < 20){
            System.out.println("Insuficiente");
        }else{
            System.out.println("Medida incorrecta, prueba de nuevo");
        }
         */

    }
}
