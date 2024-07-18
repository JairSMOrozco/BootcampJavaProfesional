public class Doctor {
    //Atributos
    static int nextValidId = 1; //Autoincremental siempre que se cree una nueva instancia
    int id;
    String name;
    String email;
    String speciality;

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
}
