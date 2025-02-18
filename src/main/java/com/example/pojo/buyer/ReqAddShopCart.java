package com.example.pojo.buyer;

import java.util.PrimitiveIterator;

public class ReqAddShopCart {
    private Integer buyerId;
    private Integer id;
    private Integer num;
    private String address;
    private Double totalPrice;

    public ReqAddShopCart() {
    }
    public ReqAddShopCart(Integer id, Integer num, String address, Double totalPrice, Integer buyerId) {
        this.id = id;
        this.num = num;
        this.address = address;
        this.totalPrice = totalPrice;
        this.buyerId = buyerId;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
