package com.example.pojo.cart;

import java.time.LocalDateTime;

public class Reqaddcart {
    private String proNum;
    private String proPrice;
    private String storeName;
    private String proName;
    private String buyerName;
    private String sellerName;
    private LocalDateTime addTime;
    private String address;

    public Reqaddcart() {
    }
    public Reqaddcart(String storeName, String proName, String buyerName, String sellerName, LocalDateTime addTime, String address, String proNum, String proPrice) {
        this.storeName = storeName;
        this.proName = proName;
        this.buyerName = buyerName;
        this.sellerName = sellerName;
        this.addTime = addTime;
        this.address = address;
        this.proNum = proNum;
        this.proPrice = proPrice;
    }

    public String getProNum() {
        return proNum;
    }

    public void setProNum(String proNum) {
        this.proNum = proNum;
    }

    public String getProPrice() {
        return proPrice;
    }

    public void setProPrice(String proPrice) {
        this.proPrice = proPrice;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public LocalDateTime getAddTime() {
        return addTime;
    }

    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
