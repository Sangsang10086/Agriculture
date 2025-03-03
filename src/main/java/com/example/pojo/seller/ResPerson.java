package com.example.pojo.seller;

public class ResPerson {
    private String username;
    private String name;
    private String phone;
    private String address;

    public ResPerson() {
    }
    public ResPerson(String username, String name, String phone, String address) {
        this.username = username;
        this.name = name;
        this.phone = phone;
        this.address = address;
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
