package com.learning.lld.prototype;

public class Document extends Prototype{
    private String type;
    private String style;
    private int capacity;

    public Document(String type, String style, int capacity){
        this.type = type;
        this.style = style;
        this.capacity = capacity;
    }

    public Prototype cloneObject(){
        return this;
    }
}
