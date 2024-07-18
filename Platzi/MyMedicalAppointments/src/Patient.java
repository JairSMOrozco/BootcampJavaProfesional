public class Patient {
    //Atributos
    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    //Métodos

    //Constructor
    public Patient(String name, String email){
        this.name = name;
        this.email = email;
    };

    //Getters
    public String getWeight(){
        return this.weight + " " + "kg.";
    }

    public String getHeight() {
        return height + " " + "Mts.";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 10){
            this.phoneNumber = phoneNumber;
        }else{
            System.out.println("El número debe de ser de 10 dígitos");
        }
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
