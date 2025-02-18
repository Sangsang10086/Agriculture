package com.example.pojo.seller;

import java.time.LocalDateTime;

public class ReqSellerAddStore {
    private String storeName;
    private Integer id;
    private LocalDateTime storeCreateTime;

    public ReqSellerAddStore() {
    }
    public ReqSellerAddStore(String storeName, Integer id, LocalDateTime storeCreateTime) {
        this.storeName = storeName;
        this.id = id;
        this.storeCreateTime = storeCreateTime;
    }

    public LocalDateTime getStoreCreateTime() {
        return storeCreateTime;
    }

    public void setStoreCreateTime(LocalDateTime storeCreateTime) {
        this.storeCreateTime = storeCreateTime;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
