package com.example.pojo.login;

/**
 * 登录成功结果封装类
 */

public class LoginInfo {
    private Integer id; //员工ID
    private String username; //用户名
    private String password; //密码
    private String token; //令牌
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LoginInfo() {
    }
    public LoginInfo(Integer id, String username, String password, String token, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.token = token;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
