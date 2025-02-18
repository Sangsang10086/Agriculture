package com.example.pojo.buyer;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.time.LocalDate;

public class Buyers {
    private int buyer_id;
    @JsonAlias("username")
    private String buyer_username;
    @JsonAlias("password")
    private String buyer_password;
    @JsonAlias("name")
    private String buyer_name;
    @JsonAlias("gender")
    private String buyer_gender;
    @JsonAlias("phone")
    private String buyer_phone;
    @JsonAlias("address")
    private String buyer_address;
    private LocalDate buyer_createTime;
    private LocalDate buyer_updateTime;

    public Buyers() {
    }
    public Buyers(int buyer_id, String buyer_username, String buyer_password, String buyer_name, String buyer_gender, String buyer_phone, String buyer_address, LocalDate buyer_createTime, LocalDate buyer_updateTime) {
        this.buyer_id = buyer_id;
        this.buyer_username = buyer_username;
        this.buyer_password = buyer_password;
        this.buyer_name = buyer_name;
        this.buyer_gender = buyer_gender;
        this.buyer_phone = buyer_phone;
        this.buyer_address = buyer_address;
        this.buyer_createTime = buyer_createTime;
        this.buyer_updateTime = buyer_updateTime;
    }

    public int getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(int buyer_id) {
        this.buyer_id = buyer_id;
    }

    public String getBuyer_username() {
        return buyer_username;
    }

    public void setBuyer_username(String buyer_username) {
        this.buyer_username = buyer_username;
    }

    public String getBuyer_password() {
        return buyer_password;
    }

    public void setBuyer_password(String buyer_password) {
        this.buyer_password = buyer_password;
    }

    public String getBuyer_name() {
        return buyer_name;
    }

    public void setBuyer_name(String buyer_name) {
        this.buyer_name = buyer_name;
    }

    public String getBuyer_gender() {
        return buyer_gender;
    }

    public void setBuyer_gender(String buyer_gender) {
        this.buyer_gender = buyer_gender;
    }

    public String getBuyer_phone() {
        return buyer_phone;
    }

    public void setBuyer_phone(String buyer_phone) {
        this.buyer_phone = buyer_phone;
    }

    public String getBuyer_address() {
        return buyer_address;
    }

    public void setBuyer_address(String buyer_address) {
        this.buyer_address = buyer_address;
    }

    public LocalDate getBuyer_createTime() {
        return buyer_createTime;
    }

    public void setBuyer_createTime(LocalDate buyer_createTime) {
        this.buyer_createTime = buyer_createTime;
    }

    public LocalDate getBuyer_updateTime() {
        return buyer_updateTime;
    }

    public void setBuyer_updateTime(LocalDate buyer_updateTime) {
        this.buyer_updateTime = buyer_updateTime;
    }
}
