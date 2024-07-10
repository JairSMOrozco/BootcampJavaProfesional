public class Doctor {
    //Atributos
    static int nextValidId = 1; //Autoincremental siempre que se cree una nueva instancia
    int id;
    String name;
    String speciality;

    //Constructor
    Doctor(){
        id = nextValidId++;
    }

    //Métodos
    public void showName(){
        System.out.println("Nombre del doctor: " + name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
}
