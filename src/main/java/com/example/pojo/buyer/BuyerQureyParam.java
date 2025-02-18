package com.example.pojo.buyer;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class BuyerQureyParam {
    private Integer pageNum=1;
    private Integer pageSize =10;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate begin;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate end;
    private Integer id;

    public BuyerQureyParam() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BuyerQureyParam(Integer pageNum, Integer pageSize, String name, LocalDate begin, LocalDate end, Integer id) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.name = name;
        this.begin = begin;
        this.end = end;
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBegin() {
        return begin;
    }

    public void setBegin(LocalDate begin) {
        this.begin = begin;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }
}
