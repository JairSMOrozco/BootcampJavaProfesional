import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    //Atributos
    static int nextValidId = 1; //Autoincremental siempre que se cree una nueva instancia
    int id;
    private String name;
    private String email;
    private String speciality;



    //Constructor
    Doctor(String name, String email, String speciality){
        id = nextValidId++;
        this.name = name;
        this.email = email;
        this.speciality = speciality;
    }

    //Métodos
    public void showName(){
        System.out.println("Nombre del doctor: " + name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
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
    }
}
