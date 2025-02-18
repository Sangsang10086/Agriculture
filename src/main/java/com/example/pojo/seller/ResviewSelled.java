package com.example.pojo.seller;

public class ResviewSelled {
    private String name;
    private String value;

    public ResviewSelled() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResviewSelled(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
