package com.sict.app.sectionrecyclerviewheader.model;

public class person {
    private String name;
    private String number;


    public person(String nam, String s) {
        this.name = nam;
        this.number = s;
    }
    public person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
