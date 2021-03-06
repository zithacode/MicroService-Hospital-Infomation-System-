package com.springproject.admissionservice.model;

public class Patient {

    private String Id;
    private String name;
    private String nationality;

    public Patient(){};

    public Patient(String id, String name, String nationality) {
        Id = id;
        this.name = name;
        this.nationality = nationality;
    }

    //Getters and Setters
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
