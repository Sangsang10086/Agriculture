package com.example.pojo.seller;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public class SellerQureyParam {
    private Integer pageNum=1;
    private Integer pageSize =10;
    private String username;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime begin;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime end;

    public SellerQureyParam() {
    }
    public SellerQureyParam(Integer pageNum, Integer pageSize, String username, LocalDateTime begin, LocalDateTime end) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.username = username;
        this.begin = begin;
        this.end = end;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDateTime getBegin() {
        return begin;
    }

    public void setBegin(LocalDateTime begin) {
        this.begin = begin;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }
}
