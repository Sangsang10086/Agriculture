package com.example.pojo.buyer;

public class BuyersDTO {
    private String data;
    private String username;
    private String name;
    private String phone;
    private String address;

    public BuyersDTO() {
    }
    public BuyersDTO(String data, String username, String name, String phone, String address) {
        this.data = data;
        this.username = username;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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
