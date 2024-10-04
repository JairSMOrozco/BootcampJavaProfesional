package com.anamorphic.clasesabstractas.form;

import com.anamorphic.clasesabstractas.form.elementos.ElementoForm;
import com.anamorphic.clasesabstractas.form.elementos.InputForm;
import com.anamorphic.clasesabstractas.form.elementos.SelectForm;
import com.anamorphic.clasesabstractas.form.elementos.TextAreaForm;
import com.anamorphic.clasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploClaseAbstracta {
    public static void main(String[] args) {

        InputForm userName = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email","email");
        InputForm edad = new InputForm("edad", "number");

        TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);
        SelectForm lenguaje = new SelectForm("lenguaje");

        Opcion java = new Opcion("1", "Java");
        Opcion python = new Opcion("2", "Python");
        Opcion javascript = new Opcion("3", "Javascript");
        Opcion typescript = new Opcion("4", "Typescript");
        Opcion php = new Opcion("5", "PHP");

        lenguaje.addOpcion(java)
        .addOpcion(python)
        .addOpcion(javascript)
        .addOpcion(typescript)
        .addOpcion(php);

        userName.setValor("john.doe");
        password.setValor("12345");
        email.setValor("john.doe@gmail.com");
        edad.setValor("28");
        experiencia.setValor("... más de 10 años de experiencia");
        java.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(userName, password, email, edad, experiencia, lenguaje);

        elementos.forEach(e -> {
            System.out.println(e.dibujarHTML());
            System.out.println("<br>");
        });

    }
}
