package com.example.pojo;

public class Order {
    private Long id;
    private Long userId;
    private Long interfaceInfoId;
    private Double money;
    private String paymentMethod;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getInterfaceInfoId() {
        return interfaceInfoId;
    }

    public void setInterfaceInfoId(Long interfaceInfoId) {
        this.interfaceInfoId = interfaceInfoId;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
