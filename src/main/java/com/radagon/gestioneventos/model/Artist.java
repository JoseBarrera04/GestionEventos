package com.radagon.gestioneventos.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Artist {
    // Attributes
    private String name;
    private int salary;

    // Constructor
    public Artist(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
