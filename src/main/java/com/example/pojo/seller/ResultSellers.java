package com.example.pojo.seller;

import java.time.LocalDate;

public class ResultSellers {
    private int seller_id;
    private String sellerUsername;
    private String sellerPassword;
    private String sellerName;
    private String sellerGender;
    private String sellerPhone;
    private String sellerAddress;
    private LocalDate sellerCreateTime;
    private LocalDate sellerUpdateTime;

    public ResultSellers() {
    }
    public ResultSellers(int seller_id, String sellerUsername, String sellerPassword, String sellerName, String sellerGender, String sellerPhone, String sellerAddress, LocalDate sellerCreateTime, LocalDate sellerUpdateTime) {
        this.seller_id = seller_id;
        this.sellerUsername = sellerUsername;
        this.sellerPassword = sellerPassword;
        this.sellerName = sellerName;
        this.sellerGender = sellerGender;
        this.sellerPhone = sellerPhone;
        this.sellerAddress = sellerAddress;
        this.sellerCreateTime = sellerCreateTime;
        this.sellerUpdateTime = sellerUpdateTime;
    }

    public int getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(int seller_id) {
        this.seller_id = seller_id;
    }

    public String getSellerUsername() {
        return sellerUsername;
    }

    public void setSellerUsername(String sellerUsername) {
        this.sellerUsername = sellerUsername;
    }

    public String getSellerPassword() {
        return sellerPassword;
    }

    public void setSellerPassword(String sellerPassword) {
        this.sellerPassword = sellerPassword;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerGender() {
        return sellerGender;
    }

    public void setSellerGender(String sellerGender) {
        this.sellerGender = sellerGender;
    }

    public String getSellerPhone() {
        return sellerPhone;
    }

    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone;
    }

    public String getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public LocalDate getSellerCreateTime() {
        return sellerCreateTime;
    }

    public void setSellerCreateTime(LocalDate sellerCreateTime) {
        this.sellerCreateTime = sellerCreateTime;
    }

    public LocalDate getSellerUpdateTime() {
        return sellerUpdateTime;
    }

    public void setSellerUpdateTime(LocalDate sellerUpdateTime) {
        this.sellerUpdateTime = sellerUpdateTime;
    }
}
