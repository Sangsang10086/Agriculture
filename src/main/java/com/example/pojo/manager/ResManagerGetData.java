package com.example.pojo.manager;

public class ResManagerGetData {
    private String id;
    private String username;
    private String name;
    private String phone;
    private String address;

    public ResManagerGetData(){

    }
    public ResManagerGetData(String id, String username, String name, String phone, String address) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
