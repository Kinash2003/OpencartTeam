package com.opencart.datamodel;

import lombok.Getter;

@Getter
public class PasswordModel {

    private String password;
    private String passwordConfirm;

    public static PasswordModel.Builder getBuilder() {
        return new PasswordModel().new Builder();
    }


    public class Builder {
        public PasswordModel.Builder password(String value) {
            password = value;
            return this;
        }

        public PasswordModel.Builder passwordConfirm(String value) {
            passwordConfirm = value;
            return this;
        }

        public PasswordModel build() {
            return PasswordModel.this;
        }
    }
}
