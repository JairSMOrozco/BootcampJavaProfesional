package com.anamorphic.clasesabstractas.form.elementos;

import com.anamorphic.clasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{
    //atributos
    private List<Opcion> opciones;

    //constructor
    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    //metodos
    public SelectForm addOpcion(Opcion opcion) {
        this.opciones.add(opcion);
        return this;
    }

    //Método abstracto heredado
    @Override
    public String dibujarHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<select ")
                .append("name = '")
                .append(nombre)
                .append("' >");

        for (Opcion opcion : this.opciones) {
            sb.append("\n<option value ='")
                    .append(opcion.getValor())
                    .append("'");
            if (opcion.isSelected()) {
                sb.append(" selected");
                this.valor = opcion.getValor();
            }
            sb.append(" >");
            sb.append(opcion.getNombre());
            sb.append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }
}
