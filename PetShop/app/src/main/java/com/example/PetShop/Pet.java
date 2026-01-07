package com.example.PetShop;

import java.util.Date;

public abstract class Pet {
    private String name;
    private Date birthDate;

    public Pet(String name) {
        this.name = name;
        this.birthDate = new Date();
    }

    public Pet(String name, Date birthdate) {
        this.name = name;
        this.birthDate = birthdate;
    }

    public abstract String speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
