public class Automovil {

    //Atributos
    private String fabricante;
    private String modelo;
    private String color = "gris";
    private double cilindrada;
    private int capacidadTanque = 40;

    private static String colorPatente = "Naranja";
    private static int capacidadTanqueEstatico = 30;

    //Constructores
    public Automovil(){

    }

    public Automovil(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color){
        this(fabricante, modelo);
        //this.fabricante = fabricante;
        //this.modelo = modelo;
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante, modelo, color);
        //this.fabricante = fabricante;
        //this.modelo = modelo;
        //this.color = color;
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque) {
        this(fabricante, modelo, color, cilindrada);
        //this.fabricante = fabricante;
        //this.modelo = modelo;
        //this.color = color;
        //this.cilindrada = cilindrada;
        this.capacidadTanque = capacidadTanque;
    }

    //getters y setters
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public static String getColorPatente(){
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente){
        Automovil.colorPatente = colorPatente;
    }

    //Métodos de operación
    public String detalle(){
        return "\nauto.fabricante = " + getFabricante() + "\n" +
                "auto.modelo = " + getModelo() + "\n" +
                "auto.color = " + getColor() + "\n" +
                "auto.cilindrada = " + getCilindrada() + "\n" +
                "auto.colorPatente = " + Automovil.colorPatente + "\n";

    }

    public String acelerar(int revolucionesPorMinuto){
        return "El auto " + getFabricante() + " acelerando a " + revolucionesPorMinuto + "rpm";
    }

    public String frenar(){
        return  getFabricante() + " " + getModelo() + " frenando";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();

        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int kilometraje, float porcentaje){
        return kilometraje / (capacidadTanque * porcentaje);
    }

    public float calcularConsumo(int kilometraje, int porcentaje){
        return kilometraje / (capacidadTanque * (porcentaje/100f));
    }

    public static float calcularConsumoEstatico(int kilometraje, int porcentaje){
        return kilometraje / (Automovil.capacidadTanqueEstatico * (porcentaje/100f));
    }

    //Sobreescritura de métodos
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(!(obj instanceof Automovil)){
            return false;
        }

        Automovil a = (Automovil) obj;
        return (this.fabricante != null
                && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }
}
