package com.grit;


import java.util.UUID;

public class Student {
    //state
    private String name;
    private UUID Id;
    private RecordBook recordBook;

    //Constructor

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, RecordBook recordBook) {
        this.name = name;
        this.recordBook = recordBook;
    }

    //behavior


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RecordBook getRecordBook() {
        return recordBook;
    }

    public void setRecordBook(RecordBook recordBook) {
        this.recordBook = recordBook;
    }
}
