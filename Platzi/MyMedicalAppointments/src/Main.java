import static ui.UIMenu.showMenu;

public class Main {

    public static void main(String[] args) {

        //Llamando métodos estáticos de ui.UIMenu
        //showMenu();

        Doctor myDoctor = new Doctor("Jair Orozco", "example@example.com", "Cirujano");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient.getName());
        System.out.println(patient.getEmail());
        patient.setHeight(54.5);
        System.out.println(patient.getHeight());

    }

}
