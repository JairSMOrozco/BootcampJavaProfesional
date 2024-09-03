import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    //Atributos
    private String speciality;


    //Constructor
    Doctor(String name, String email){
        super(name, email);
        this.speciality = speciality;
    }

    //Métodos

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Declaracion de un ArrayList que contendra los datos para las citas
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    //Metodo que agrega al arrayList los datos de las citas que se van generando
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    //Metodo que regresa la informacion que hay en el arrayList
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSpeciality: " + speciality +
                "\nAvailable" +
                "\n" + availableAppointments.toString();
    }

    // Clase estatica anidada con sus getters y setters
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appoointments " +
                    "\nDate: " + date +
                    "\nTime: " + time;
        }
    }

}
