import java.util.Date;

import static ui.UIMenu.showMenu;

public class Main {

    public static void main(String[] args) {

        //Llamando métodos estáticos de ui.UIMenu
        //showMenu();

        Doctor myDoctor = new Doctor("Jair Orozco", "example@example.com", "Cirujano");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10pm");
        myDoctor.addAvailableAppointment(new Date(), "11am");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");

    }

}
