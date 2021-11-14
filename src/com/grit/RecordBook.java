package com.grit;




public class RecordBook {
    //state
    private String grades;

    //Constructor
    public RecordBook(String grades) {
        this.grades = grades;
    }

    //behavior
    public String getGrades() {
        return grades;
    }

    public void setGrades (String grades) {
        this.grades = grades;
    }


}
