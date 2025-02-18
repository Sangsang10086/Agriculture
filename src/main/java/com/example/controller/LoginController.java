package com.example.controller;

import com.example.pojo.*;
import com.example.pojo.login.ChangePW;
import com.example.pojo.login.LoginInfo;
import com.example.pojo.login.LoginRequest;
import com.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class LoginController {

    @Autowired
    private LoginService loginService;


    //总登录
    @PostMapping("/loginTotal")
    public Result loginTotal(@RequestBody LoginRequest loginRequest){
        LoginInfo loginInfo = loginService.loginTotal(loginRequest);
        return Result.success(loginInfo);
    }
//    买家注册
    @PostMapping("/user/register")
    public Result register(@RequestBody LoginRequest loginRequest){
        loginService.register(loginRequest);
        return Result.success();
    }
    //卖家注册
    @PostMapping("/user/sellerRegister")
    public Result sellerRegister(@RequestBody LoginRequest loginRequest){
        loginService.sellerRegister(loginRequest);
        return Result.success();
    }
    //管理员修改密码
    @PostMapping("/manager/changePassword")
    public Result changePassword(@RequestBody ChangePW changePW){
        boolean flag = loginService.changePassword(changePW);
        if (flag==true){
            return Result.success();
        }
        return Result.error();
    }


}
