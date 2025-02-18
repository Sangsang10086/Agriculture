package com.example.pojo.seller;

public class ResSellerPro {
    private Integer id;
    private String img;
    private String storeName;
    private String storeSort;
    private String storeMoney;
    private String storeIndate;
    private String storeDetail;
    private String storeSize;
    private String storeSellNum;
    private String storeStore;


    public ResSellerPro() {
    }
    public ResSellerPro(Integer id, String img, String storeName, String storeSort, String storeMoney, String storeIndate, String storeDetail, String storeSize, String storeSellNum, String storeStore) {
        this.id = id;
        this.img = img;
        this.storeName = storeName;
        this.storeSort = storeSort;
        this.storeMoney = storeMoney;
        this.storeIndate = storeIndate;
        this.storeDetail = storeDetail;
        this.storeSize = storeSize;
        this.storeSellNum = storeSellNum;
        this.storeStore = storeStore;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreSort() {
        return storeSort;
    }

    public void setStoreSort(String storeSort) {
        this.storeSort = storeSort;
    }

    public String getStoreMoney() {
        return storeMoney;
    }

    public void setStoreMoney(String storeMoney) {
        this.storeMoney = storeMoney;
    }

    public String getStoreIndate() {
        return storeIndate;
    }

    public void setStoreIndate(String storeIndate) {
        this.storeIndate = storeIndate;
    }

    public String getStoreDetail() {
        return storeDetail;
    }

    public void setStoreDetail(String storeDetail) {
        this.storeDetail = storeDetail;
    }

    public String getStoreSize() {
        return storeSize;
    }

    public void setStoreSize(String storeSize) {
        this.storeSize = storeSize;
    }

    public String getStoreSellNum() {
        return storeSellNum;
    }

    public void setStoreSellNum(String storeSellNum) {
        this.storeSellNum = storeSellNum;
    }

    public String getStoreStore() {
        return storeStore;
    }

    public void setStoreStore(String storeStore) {
        this.storeStore = storeStore;
    }
}
