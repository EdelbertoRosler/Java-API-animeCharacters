package com.animeCharacters.APIanimes.enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipeSkill {
    STRENGTH("Strength"),
    ATTACK("Attack"),
    DEFENSE("Defense"),
    SWORD("Sword"),
    FLIGHT("Flight"),
    SPECIALPOWERS("SpecialPowers");

    private  final String descricao;
}
