package com.example.pojo.seller;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.time.LocalDateTime;

public class Sellers {
    private String seller_id;
    @JsonAlias("username")
    private String seller_username;
    @JsonAlias("password")
    private String seller_password;
    @JsonAlias("name")
    private String seller_name;
    @JsonAlias("gender")
    private String seller_gender;
    @JsonAlias("phone")
    private String seller_phone;
    @JsonAlias("address")
    private String seller_address;
    private LocalDateTime seller_createTime;
    private LocalDateTime seller_updateTime;

    public Sellers() {
    }
    public Sellers(String seller_id, String seller_username, String seller_password, String seller_name, String seller_gender, String seller_phone, String seller_address, LocalDateTime seller_createTime, LocalDateTime seller_updateTime) {
        this.seller_id = seller_id;
        this.seller_username = seller_username;
        this.seller_password = seller_password;
        this.seller_name = seller_name;
        this.seller_gender = seller_gender;
        this.seller_phone = seller_phone;
        this.seller_address = seller_address;
        this.seller_createTime = seller_createTime;
        this.seller_updateTime = seller_updateTime;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public String getSeller_username() {
        return seller_username;
    }

    public void setSeller_username(String seller_username) {
        this.seller_username = seller_username;
    }

    public String getSeller_password() {
        return seller_password;
    }

    public void setSeller_password(String seller_password) {
        this.seller_password = seller_password;
    }

    public String getSeller_name() {
        return seller_name;
    }

    public void setSeller_name(String seller_name) {
        this.seller_name = seller_name;
    }

    public String getSeller_gender() {
        return seller_gender;
    }

    public void setSeller_gender(String seller_gender) {
        this.seller_gender = seller_gender;
    }

    public String getSeller_phone() {
        return seller_phone;
    }

    public void setSeller_phone(String seller_phone) {
        this.seller_phone = seller_phone;
    }

    public String getSeller_address() {
        return seller_address;
    }

    public void setSeller_address(String seller_address) {
        this.seller_address = seller_address;
    }

    public LocalDateTime getSeller_createTime() {
        return seller_createTime;
    }

    public void setSeller_createTime(LocalDateTime seller_createTime) {
        this.seller_createTime = seller_createTime;
    }

    public LocalDateTime getSeller_updateTime() {
        return seller_updateTime;
    }

    public void setSeller_updateTime(LocalDateTime seller_updateTime) {
        this.seller_updateTime = seller_updateTime;
    }
}
