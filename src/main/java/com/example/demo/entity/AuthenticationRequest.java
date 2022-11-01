package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@ApiModel(description = "Form request authenticate api of users")
public class AuthenticationRequest {

    @ApiModelProperty(notes = "username of users",
            example = "user_1", required = true, position = 1)
    @NotNull
    private String username;
    @ApiModelProperty(notes = "password of users",
            example = "123456", required = true, position = 2)
    @NotNull
    private String password;

    public AuthenticationRequest(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public AuthenticationRequest() {

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

}
