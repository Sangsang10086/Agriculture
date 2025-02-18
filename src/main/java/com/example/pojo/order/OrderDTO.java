package com.example.pojo.order;

public class OrderDTO {
    private Integer orderId;
    private String proName;
    private String proPrice;
    private String proNum;
    private String proPay;
    private String proStatus;

    public OrderDTO() {
    }
    public OrderDTO(Integer orderId, String proName, String proPrice, String proNum, String proPay, String proStatus) {
        this.orderId = orderId;
        this.proName = proName;
        this.proPrice = proPrice;
        this.proNum = proNum;
        this.proPay = proPay;
        this.proStatus = proStatus;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProPrice() {
        return proPrice;
    }

    public void setProPrice(String proPrice) {
        this.proPrice = proPrice;
    }

    public String getProNum() {
        return proNum;
    }

    public void setProNum(String proNum) {
        this.proNum = proNum;
    }

    public String getProPay() {
        return proPay;
    }

    public void setProPay(String proPay) {
        this.proPay = proPay;
    }

    public String getProStatus() {
        return proStatus;
    }

    public void setProStatus(String proStatus) {
        this.proStatus = proStatus;
    }
}
