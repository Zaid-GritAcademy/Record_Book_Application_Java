package com.grit;

import java.util.List;

public class Student {
    //state
    private String name;


    //Constructor
    public Student(String name) {
        this.name = name;

    }

    //behavior
    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }
}
