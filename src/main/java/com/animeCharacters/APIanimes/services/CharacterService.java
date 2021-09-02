package com.animeCharacters.APIanimes.services;

import com.animeCharacters.APIanimes.repositories.ICharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {
    ICharacterRepository iCharacterRepository;

    @Autowired
    public CharacterService(ICharacterRepository iCharacterRepository) {
        this.iCharacterRepository = iCharacterRepository;
    }
}
