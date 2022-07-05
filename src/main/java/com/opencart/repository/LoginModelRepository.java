package com.opencart.repository;

import com.opencart.datamodel.LoginModel;

public class LoginModelRepository {

    private LoginModelRepository() {
    }
    public static LoginModel getLoginModel() {
        return LoginModel.getBuilder()
                .email("rkinash8@gmail.com")
                .password("12345678")
                .build();
    }


}







