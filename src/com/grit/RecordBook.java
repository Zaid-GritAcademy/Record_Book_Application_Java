package com.grit;

public class RecordBook {
    //state
    private int svenska;
    private int engelska;
    private int matematik;

    //Constructor
    public RecordBook(int svenska, int engelska, int matematik) {
        this.svenska = svenska;
        this.engelska = engelska;
        this.matematik = matematik;
    }
    //behavior
    public int getSvenska() {
        return svenska;
    }

    public int getEngelska() {
        return engelska;
    }

    public int getMatematik() {
        return matematik;
    }

    public void setSvenska(int svenska) {
        this.svenska = svenska;
    }

    public void setEngelska(int engelska) {
        this.engelska = engelska;
    }

    public void setMatematik(int matematik) {
        this.matematik = matematik;
    }
}
