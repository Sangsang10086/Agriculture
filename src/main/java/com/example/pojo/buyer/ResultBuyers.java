package com.example.pojo.buyer;

import java.time.LocalDate;

public class ResultBuyers {
    private int buyer_id;
    private String buyerUsername;
    private String buyerPassword;
    private String buyerName;
    private String buyerGender;
    private String buyerPhone;
    private String buyerAddress;
    private LocalDate buyerCreateTime;
    private LocalDate buyerUpdateTime;

    public ResultBuyers() {
    }
    public ResultBuyers(int buyer_id, String buyerUsername, String buyerPassword, String buyerName, String buyerGender, String buyerPhone, String buyerAddress, LocalDate buyerCreateTime, LocalDate buyerUpdateTime) {
        this.buyer_id = buyer_id;
        this.buyerUsername = buyerUsername;
        this.buyerPassword = buyerPassword;
        this.buyerName = buyerName;
        this.buyerGender = buyerGender;
        this.buyerPhone = buyerPhone;
        this.buyerAddress = buyerAddress;
        this.buyerCreateTime = buyerCreateTime;
        this.buyerUpdateTime = buyerUpdateTime;
    }

    public int getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(int buyer_id) {
        this.buyer_id = buyer_id;
    }

    public String getBuyerUsername() {
        return buyerUsername;
    }

    public void setBuyerUsername(String buyerUsername) {
        this.buyerUsername = buyerUsername;
    }

    public String getBuyerPassword() {
        return buyerPassword;
    }

    public void setBuyerPassword(String buyerPassword) {
        this.buyerPassword = buyerPassword;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerGender() {
        return buyerGender;
    }

    public void setBuyerGender(String buyerGender) {
        this.buyerGender = buyerGender;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public LocalDate getBuyerCreateTime() {
        return buyerCreateTime;
    }

    public void setBuyerCreateTime(LocalDate buyerCreateTime) {
        this.buyerCreateTime = buyerCreateTime;
    }

    public LocalDate getBuyerUpdateTime() {
        return buyerUpdateTime;
    }

    public void setBuyerUpdateTime(LocalDate buyerUpdateTime) {
        this.buyerUpdateTime = buyerUpdateTime;
    }
}
