package com.clase2809.servicio;

import com.clase2809.model.Persona;

import java.util.List;

public interface PersonaServicio {
    Boolean createPersona(Persona persona);
    Persona readPersona(Long id);
    Boolean updatePersona(Persona persona);
    Boolean deletePersona(Persona persona);
    List<Persona> getAllPersonas();
}
