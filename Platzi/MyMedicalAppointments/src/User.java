public class User {
    //Atributos
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    //Constructor

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 10){
            this.phoneNumber = phoneNumber;
        }else{
            System.out.println("El número debe de ser de 10 dígitos");
        }
    }

    @Override
    public String toString() {
        return "Name: " + this.name +
                "\nEmail: " + this.email +
                "\nAddress: " + this.address +
                "\nPhone: " + this.phoneNumber;
    }

}
