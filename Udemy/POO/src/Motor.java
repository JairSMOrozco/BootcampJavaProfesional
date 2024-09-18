public class Motor {
    //Atributos
    private double cilindrada;
    private TipoMotor tipo;

    //Constructores
    public Motor(){
    }

    public Motor(double cilindrada, TipoMotor tipo){
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    //Getters and Setters
    public double getCilindrada(){
        return cilindrada;
    }
    public void setCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public TipoMotor getTipo(){
        return tipo;
    }
    public void setTipo(TipoMotor tipo){
        this.tipo = tipo;
    }
}
