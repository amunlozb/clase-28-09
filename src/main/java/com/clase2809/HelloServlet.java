package com.clase2809;

import java.io.*;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

import com.clase2809.model.Persona;
import com.clase2809.servicio.PersonaServicio;
import com.clase2809.servicio.PersonaServicioImpl;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    PersonaServicio servicio = new PersonaServicioImpl();

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        List<Persona> personas = servicio.getAllPersonas();
        request.setAttribute("PERSONAS", personas);

        RequestDispatcher dispatcher = request.getRequestDispatcher("listaPersona.jsp");
        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        boolean filtrarMenores = "true".equals(request.getAttribute("filter"));

        List<Persona> personas = servicio.getAllPersonas();

        if (filtrarMenores) {
            personas = personas.stream().filter(p -> {

                Calendar c = Calendar.getInstance();
                c.setTime(p.getFechaNacimiento());
                int year = c.get(Calendar.YEAR);
                int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                return (currentYear - year) <= 18;

            }).collect(Collectors.toList());
        }
    }


    public void destroy() {
    }
}