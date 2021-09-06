package com.animeCharacters.APIanimes.services;

import com.animeCharacters.APIanimes.entities.Persona;
import com.animeCharacters.APIanimes.repositories.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    IPersonaRepository iPersonaRepository;

    @Autowired
    public PersonaService(IPersonaRepository iPersonaRepository) {
        this.iPersonaRepository = iPersonaRepository;
    }

    public Persona postPersona(Persona persona) { return iPersonaRepository.save(persona); }

    public List<Persona> getPersona(){ return iPersonaRepository.findAll(); }

    public Optional<Persona> getPersonaId(Long id) { return iPersonaRepository.findById(id);}

    public Persona putPersona(Persona persona) { return iPersonaRepository.save(persona);}

    public void deletePersona(Long id) { iPersonaRepository.deleteById(id);}
}
