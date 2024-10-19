package com.horizon.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Document
public class User {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public HashMap getSkills() {
        return skills;
    }

    public void setSkills(HashMap skills) {
        this.skills = skills;
    }

    @Id
    private String id;
    private String name;
    private String surname;
    private HashMap skills;
}
