package com.animeCharacters.APIanimes.controllers;


import com.animeCharacters.APIanimes.entities.Persona;
import com.animeCharacters.APIanimes.exceptions.personaNotFoundException;
import com.animeCharacters.APIanimes.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/vi/persona")
public class Personacontroller {
    @Autowired
    PersonaService personaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Persona criarPersona (@RequestBody @Validated Persona persona){ return personaService.postPersona(persona);}

    @GetMapping
    public List<Persona> getPersona(){ return personaService.getPersona();}

    @GetMapping("/{id}")
    public ResponseEntity<Persona> getPersonaId (@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(personaService.getPersonaId(id).orElseThrow(() ->
            new personaNotFoundException("Persona whit id " + id + "not found ")));
    }

    @PutMapping("/{id}")
    public Object putPersona (@PathVariable Long id, @RequestBody Persona persona) throws personaNotFoundException {
        try { return personaService.putPersona(persona); }
        catch (Exception ex) { System.out.println(ex.getMessage()); }
        return ("Persona whit id " + id + "not found ");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Persona> deletePersona (@PathVariable Long id) throws personaNotFoundException{
        try { personaService.deletePersona(id); }
        catch (Exception ex) { System.out.println(ex.getMessage()); }
        return ResponseEntity.ok().build();
    }

}
