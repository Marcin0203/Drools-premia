package com.example.testdrools;

import java.util.HashSet;
import java.util.Set;

public class Kontrakt {

    private String name;

    private Double cena;

    private Double prowizja = 0.00;

    private String opis;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public Double getProwizja() {
        return prowizja;
    }

    public void setProwizja(Double prowizja) {

        this.prowizja= this.prowizja+prowizja;
    }

}
