package enums;

public enum EstacionesAnio {
    PRIMAVERA("Hay mucho sol", "Marzo, Abril, Mayo, Junio"),
    VERANO("Hace calor y llueve", "Junio, Julio, Agosto, Septiembre"),
    OTOÑO("Las hojas caen", "Septiembre, Octubre, Noviembre, Diciembre"),
    INVIERNO("Hace frio", "Diciembre, Enero, Febrero, Marzo");
    String descripcion;
    String mesesEstacion;

    EstacionesAnio(String descripcion, String mesesEstacion){
        this.descripcion = descripcion;
        this.mesesEstacion = mesesEstacion;
    };

    public String getDescripcion() {
        return descripcion;
    }

    public String getMesesEstacion() {
        return mesesEstacion;
    }
}
