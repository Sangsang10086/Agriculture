package com.example.pojo.buyer;


public class Managers {
    private Integer manager_id;
    private String manager_username;
    private String manager_password;

    public Managers(Integer manager_id, String manager_username, String manager_password) {
        this.manager_id = manager_id;
        this.manager_username = manager_username;
        this.manager_password = manager_password;
    }
    public Managers() {
    }
    public Integer getManager_id() {
        return manager_id;
    }

    public void setManager_id(Integer manager_id) {
        this.manager_id = manager_id;
    }

    public String getManager_username() {
        return manager_username;
    }

    public void setManager_username(String manager_username) {
        this.manager_username = manager_username;
    }

    public String getManager_password() {
        return manager_password;
    }

    public void setManager_password(String manager_password) {
        this.manager_password = manager_password;
    }
}