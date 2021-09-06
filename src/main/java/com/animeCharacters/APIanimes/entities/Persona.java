package com.animeCharacters.APIanimes.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Persona implements Serializable {
    private static final long serialVersionVID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String animename;

    private String name;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date birthdate;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Skills> skills;

    public Persona(String animename, String name, Date birthdate, List<Skills> skills) {
        this.animename = animename;
        this.name = name;
        this.birthdate = birthdate;
        this.skills = skills;
    }
}
