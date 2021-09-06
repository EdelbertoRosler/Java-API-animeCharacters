package com.animeCharacters.APIanimes.exceptions;

public class personaNotFoundException extends RuntimeException{
    public personaNotFoundException(String s) { super(s); }

    public personaNotFoundException(String s, Throwable error) { super(s, error); }
}
