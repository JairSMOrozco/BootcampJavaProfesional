package org.jairorozco.webapp.servlet.webapptarea1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@WebServlet("/index.html")
public class indexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        //parametros
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        DateFormat dateFormat = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        String fecha = dateFormat.format(new Date());

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("   <head>");
        out.println("       <meta charset=\"UTF-8\">");
        out.println("       <title>Tarea 1</title>");
        out.println("   </head>");
        out.println("   <body>");
        out.println("       <h1>Tarea 1: Servlet y envío de parámetros</h1>");
        if (nombre != null && apellido != null) {
            out.println("       <p>Hola, mi nombre es : " + nombre + " " + apellido + "</p>");
        }else {
            out.println("       <p>No se enviaron los parámetros completos</p>");
        }

        out.println("       <p>La fecha actual es: " + fecha + "</p>");

        out.println("   </body>");
        out.println("</html>");
        out.close();
    }
}
