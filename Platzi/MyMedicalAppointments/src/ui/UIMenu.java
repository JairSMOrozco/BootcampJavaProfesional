package ui;
import java.util.Scanner;

public class UIMenu {
    //Atributos
    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "JUnio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};


    //Métodos
    public static void showMenu(){
        System.out.println("Welcome to My Medical Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for your visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while(response != 0);
    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());

            switch (response){
                case 1:
                    System.out.println(":: Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i +". " + MONTHS[i - 1]);
                    }
                    break;
                case 2:
                    System.out.println(":: My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }

        }while(response != 0);
    }
}
