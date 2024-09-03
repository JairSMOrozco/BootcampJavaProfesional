import java.util.Date;

import static ui.UIMenu.showMenu;

public class Main {

    public static void main(String[] args) {

        //Llamando métodos estáticos de ui.UIMenu
        //showMenu();

        Doctor myDoctor = new Doctor("Jair Orozco", "example@example.com");
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        myDoctor.addAvailableAppointment(new Date(), "11am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        //System.out.println(patient);
        System.out.println(myDoctor);

    }

}
