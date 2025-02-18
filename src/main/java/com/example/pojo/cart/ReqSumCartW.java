package com.example.pojo.cart;

import java.util.List;

public class ReqSumCartW {
    private List<ReqSumCart> reqSumCart;
    private Integer buyerId;

    public ReqSumCartW() {
    }
    public ReqSumCartW(List<ReqSumCart> reqSumCart, Integer buyerId) {
        this.reqSumCart = reqSumCart;
        this.buyerId = buyerId;
    }

    public List<ReqSumCart> getReqSumCart() {
        return reqSumCart;
    }

    public void setReqSumCart(List<ReqSumCart> reqSumCart) {
        this.reqSumCart = reqSumCart;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }
}
