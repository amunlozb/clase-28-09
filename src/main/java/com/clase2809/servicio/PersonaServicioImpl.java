package com.clase2809.servicio;

import com.clase2809.model.Persona;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonaServicioImpl implements PersonaServicio {

    private final Map<Long, Persona> personas = new HashMap<>();

    public PersonaServicioImpl() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            personas.put(1L, new Persona(1L, "Juan", "Perez", sdf.parse("01-01-1990"), "Sevilla"));
            personas.put(2L, new Persona(2L, "María", "Gómez", sdf.parse("21-07-1990"), "Málaga"));
            personas.put(3L, new Persona(3L, "Raul", "Rodríguez", sdf.parse("01-01-2016"), "Cádiz"));

        } catch (ParseException e) {
            System.out.println(e.toString());
        }
    }

    @Override
    public Boolean createPersona(Persona persona) {
        return null;
    }

    @Override
    public Persona readPersona(Long id) {
        return null;
    }

    @Override
    public Boolean updatePersona(Persona persona) {
        return null;
    }

    @Override
    public Boolean deletePersona(Persona persona) {
        return null;
    }

    @Override
    public List<Persona> getAllPersonas() {

        return new ArrayList<>(personas.values());
    }

}
