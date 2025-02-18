package com.example.pojo.seller;

import java.time.LocalDateTime;

public class ReqFile {
    private String proName;
    private String proPrice;
    private String proNum;
    private String proStore;
    private String proDetail;
    private String file;
    private String sellerId;
    private LocalDateTime proIndate;

    public ReqFile() {
    }
    public ReqFile(String proName, String proPrice, String proNum, String proStore, String proDetail, String file, String sellerId, LocalDateTime proIndate) {
        this.proName = proName;
        this.proPrice = proPrice;
        this.proNum = proNum;
        this.proStore = proStore;
        this.proDetail = proDetail;
        this.file = file;
        this.sellerId = sellerId;
        this.proIndate = proIndate;
    }

    public LocalDateTime getProIndate() {
        return proIndate;
    }

    public void setProIndate(LocalDateTime proIndate) {
        this.proIndate = proIndate;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
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

    public String getProStore() {
        return proStore;
    }

    public void setProStore(String proStore) {
        this.proStore = proStore;
    }

    public String getProDetail() {
        return proDetail;
    }

    public void setProDetail(String proDetail) {
        this.proDetail = proDetail;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
