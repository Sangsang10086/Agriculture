package com.example.pojo.cart;

import java.time.LocalDateTime;

public class ReqSumCart {
    private Integer id;
    private String storeName;
    private String img;
    private String detail;
    private Integer num;
    private String price;
    private boolean selected;
    private Integer buyerId;
    private LocalDateTime createdDate;

    public ReqSumCart() {
    }
    public ReqSumCart(Integer id, String storeName, String img, String detail, Integer num, String price, boolean selected, Integer buyerId, LocalDateTime createdDate) {
        this.id = id;
        this.storeName = storeName;
        this.img = img;
        this.detail = detail;
        this.num = num;
        this.price = price;
        this.selected = selected;
        this.buyerId = buyerId;
        this.createdDate = createdDate;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
