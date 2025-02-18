package com.example.pojo.store;


public class Resstore {
    private Integer id;
    private String storeName;

    public Integer getId() {
        return id;
    }

    public String getStoreName() {
        return storeName;
    }

    public Resstore(){

    }
    public Resstore(Integer id, String storeName) {
        this.id = id;
        this.storeName = storeName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
}
