package com.example.service;

import com.example.pojo.login.ChangePW;
import com.example.pojo.login.LoginInfo;
import com.example.pojo.login.LoginRequest;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {


    void register(LoginRequest loginRequest);


    void sellerRegister(LoginRequest loginRequest);


    boolean changePassword(ChangePW changePW);

    LoginInfo loginTotal(LoginRequest loginRequest);
}
