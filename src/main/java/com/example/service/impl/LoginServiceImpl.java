package com.example.service.impl;

import com.example.mapper.LoginMapper;
import com.example.pojo.login.ChangePW;
import com.example.pojo.login.LoginInfo;
import com.example.pojo.login.LoginRequest;
import com.example.service.LoginService;
import com.example.util.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;




    @Override
    public void register(LoginRequest loginRequest) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();
        loginMapper.register(username, password);
    }



    @Override
    public void sellerRegister(LoginRequest loginRequest) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();
        loginMapper.sellerRegister(username, password);
    }



    // 修改密码
    @Override
    public boolean changePassword(ChangePW changePW) {
        String oldPassword = loginMapper.selectPW(changePW);
        if (oldPassword == null) {
            return false;
        }
        loginMapper.changePW(changePW);
        return true;
    }

    @Override
    public LoginInfo loginTotal(LoginRequest loginRequest) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();
        Integer BuyerId = loginMapper.getIdByUsernameAndPassword(loginRequest);
        Integer SellerId = loginMapper.getsellerIdByUsernameAndPassword(username,password);
        Integer  ManagerId = loginMapper.getmanagerIdByUsernameAndPassword(username,password);
        LoginInfo loginInfo = new LoginInfo();
        loginInfo.setUsername(loginRequest.getUsername());
        loginInfo.setPassword(loginRequest.getPassword());
        if (BuyerId !=null) {
            //1. 生成JWT令牌
            Map<String, Object> dataMap = new HashMap<>();
            dataMap.put("id", BuyerId);
            dataMap.put("username", loginRequest.getUsername());
            String jwt = JwtUtils.generateJwt(dataMap);
            loginInfo.setId(BuyerId);
            loginInfo.setRole("buyer");
            loginInfo.setToken(jwt);
            return loginInfo;
        } else if (SellerId != null) {
            //1. 生成JWT令牌
            Map<String, Object> dataMap = new HashMap<>();
            dataMap.put("id", SellerId);
            dataMap.put("username", loginRequest.getUsername());
            String jwt = JwtUtils.generateJwt(dataMap);
            loginInfo.setId(SellerId);
            loginInfo.setRole("seller");
            loginInfo.setToken(jwt);
            return loginInfo;
        } else if (ManagerId!=null) {
            //1. 生成JWT令牌
            Map<String, Object> dataMap = new HashMap<>();
            dataMap.put("id", ManagerId);
            dataMap.put("username", loginRequest.getUsername());
            String jwt = JwtUtils.generateJwt(dataMap);
            loginInfo.setId(ManagerId);
            loginInfo.setRole("manager");
            loginInfo.setToken(jwt);
            return loginInfo;
        }else {
            return null;
        }
    }


    private LoginInfo getLoginInfo(LoginRequest loginRequest, Integer id) {
        if (id !=null) {
            //1. 生成JWT令牌
            Map<String, Object> dataMap = new HashMap<>();
            dataMap.put("id", id);
            dataMap.put("username", loginRequest.getUsername());

            String jwt = JwtUtils.generateJwt(dataMap);
            LoginInfo loginInfo = new LoginInfo();
            loginInfo.setId(id);
            loginInfo.setUsername(loginRequest.getUsername());
            loginInfo.setPassword(loginRequest.getPassword());
            loginInfo.setToken(jwt);
            return loginInfo;
        } else {
            return null;
        }
    }
}
