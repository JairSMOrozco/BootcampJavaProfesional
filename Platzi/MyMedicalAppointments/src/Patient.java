public class Patient extends User{
    //Atributos

    private String birthday;
    private double weight;
    private double height;
    private String blood;

    //Métodos

    //Constructor
    public Patient(String name, String email){
        super(name, email);
    };

    //Getters
    public String getWeight(){
        return this.weight + " " + "kg.";
    }

    public String getHeight() {
        return height + " " + "Mts.";
    }

    public String getBirthday() {
        return birthday;
    }

    public String getBlood() {
        return blood;
    }


    //Setters
    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAge: " + this.birthday +
                "\nWeight: " + this.getWeight() +
                "\nHeight: " + this.getHeight() +
                "\nBlood: " + this.blood;
    }
}
