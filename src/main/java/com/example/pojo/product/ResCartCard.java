package com.example.pojo.product;

public class ResCartCard {
    private Integer id;
    private String storeName;
    private String img;
    private String detail;
    private String price;
    private Integer num;
    private Boolean selected;

    public ResCartCard() {
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public ResCartCard(Integer id, String storeName, String img, String detail, String price, Integer num , Boolean selected) {
        this.id = id;
        this.storeName = storeName;
        this.img = img;
        this.detail = detail;
        this.price = price;
        this.num = num;
        this.selected = selected;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
