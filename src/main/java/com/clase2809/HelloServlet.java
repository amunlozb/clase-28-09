package com.clase2809;

import java.io.*;
import java.util.List;

import com.clase2809.model.Persona;
import com.clase2809.servicio.PersonaServicio;
import com.clase2809.servicio.PersonaServicioImpl;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    PersonaServicio servicio = new PersonaServicioImpl();

    public void init() {
        message = "Do get";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("do get reached");

        List<Persona> personas = servicio.getAllPersonas();
        request.setAttribute("PERSONAS", personas);

        RequestDispatcher dispatcher = request.getRequestDispatcher("");
    }

    public void destroy() {
    }
}