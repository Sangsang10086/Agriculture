package com.example.pojo.cart;

import java.time.LocalDateTime;

public class Resshopcart {
    private Integer id;
    private String storeName;
    private String proName;
    private String buyerName;
    private String sellerName;
    private LocalDateTime data;
    private String address;

    public Resshopcart() {
    }
    public Resshopcart(Integer id, String storeName, String proName, String buyerName, String sellerName, LocalDateTime data, String address) {
        this.id = id;
        this.storeName = storeName;
        this.proName = proName;
        this.buyerName = buyerName;
        this.sellerName = sellerName;
        this.data = data;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
