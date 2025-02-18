package com.example.pojo.buyer;

import java.time.LocalDateTime;

public class BuyPerResponse {
    private String username;
    private String name;
    private String phone;
    private String address;
    private String gender;
    private LocalDateTime data;

    public BuyPerResponse() {
    }
    public BuyPerResponse(String username, String name, String phone, String address, String gender, LocalDateTime data) {
        this.username = username;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
