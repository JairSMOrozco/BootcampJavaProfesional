public class Automovil implements Comparable<Automovil>{

    //Atributos
    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS_OSCURO;
    private Motor motor;
    private Tanque tanque;
    private TipoAutomovil tipo;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRueda;

    //Atributos estáticos
    private static int ultimoId;
    private static Color colorPatente = Color.NARANJA;
    private static int capacidadTanqueEstatico = 30;
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    /*
    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS_OSCURO = "Gris Oscuro";
    */

    //Constructores
    public Automovil(){
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color){
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque) {
        this(fabricante, modelo, color, motor);
        this.tanque = tanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, tanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    //getters y setters

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

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

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }


    public static Color getColorPatente(){
        return colorPatente;
    }
    public static void setColorPatente(Color colorPatente){
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadTanqueEstatico(){
        return capacidadTanqueEstatico;
    }
    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico){
        Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }
    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tanque getTanque() {
        return tanque;
    }
    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public Persona getConductor() {
        return conductor;
    }
    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }
    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }
    public Automovil addRueda(Rueda rueda){
        if (indiceRueda < this.ruedas.length){
            this.ruedas[indiceRueda++] = rueda;
        }
        return this;
    }

    //Métodos de operación
    public String detalle(){
        String detalle = "\nauto.id = " + getId() + "\n" +
                "auto.fabricante = " + getFabricante() + "\n" +
                "auto.modelo = " + getModelo() + "\n";

                if(getTipo() != null){
                    detalle += "auto.tipo = " + getTipo().getNombre() + "\n";
                }

                detalle += "auto.color = " + getColor() + "\n";

                if(getMotor() != null){
                    detalle += "auto.cilindrada = " + getMotor().getCilindrada() + "\n";
                }

                detalle += "auto.colorPatente = " + Automovil.getColorPatente() + "\n";

                if(getConductor() != null){
                    detalle += "\nConductor: " + getConductor();
                }

                if(getRuedas() != null){
                    detalle += "\nRuedas del automovil: ";
                    for (Rueda ruedas: getRuedas()){
                        detalle += ruedas.getFabricante() + ", aro: " + ruedas.getAro() + ", ancho: " + ruedas.getAncho() + "\n";
                    }
                }

        return detalle;

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
        return kilometraje / (getTanque().getCapacidad() * porcentaje);
    }

    public float calcularConsumo(int kilometraje, int porcentaje){
        return kilometraje / (getTanque().getCapacidad() * (porcentaje/100f));
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
        return  id +
                ": " + fabricante +
                "/" + modelo;
    }

    @Override
    public int compareTo(Automovil auto) {
        return this.fabricante.compareTo(auto.fabricante);
    }
}
