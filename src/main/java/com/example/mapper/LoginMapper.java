package com.example.mapper;

import com.example.pojo.login.ChangePW;
import com.example.pojo.login.LoginRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface LoginMapper {


    Integer getIdByUsernameAndPassword(@Param("loginRequest") LoginRequest loginRequest);

    void register(String username, String password);

    Integer getsellerIdByUsernameAndPassword(String username, String password);

    void sellerRegister(String username, String password);

    Integer getmanagerIdByUsernameAndPassword(String username, String password);

    String selectPW(ChangePW changePW);

    void changePW(ChangePW changePW);
}