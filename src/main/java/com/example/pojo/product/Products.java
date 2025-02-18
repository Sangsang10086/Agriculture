package com.example.pojo.product;

public class Products {
    private Integer id;
    private String image;
    private String text;
    private String price;
    private Integer num;
    private String storeName;

    public Products() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Products(String image, String text, String price, Integer num, String storeName, Integer id) {
        this.image = image;
        this.text = text;
        this.price = price;
        this.num = num;
        this.storeName = storeName;
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
