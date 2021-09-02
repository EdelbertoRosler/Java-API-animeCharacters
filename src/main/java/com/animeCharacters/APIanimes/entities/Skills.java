package com.animeCharacters.APIanimes.entities;

import com.animeCharacters.APIanimes.enuns.TipeSkill;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private TipeSkill tipe;

    private Long ValueSkill;


    public Skills(TipeSkill tipe, Long valueSkill) {
        this.tipe = tipe;
        ValueSkill = valueSkill;
    }
}

