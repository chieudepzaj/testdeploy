package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "A jwt token return after user authentication successful")
public class AuthenticationResponse {

    @ApiModelProperty(notes = "Jwt Token",
            example = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbjEyMyIsImlzQWRtaW4iOnRydWUsImV4cCI6MTY2Njk3NjUxMiwiaWF0IjoxNjY2OTc2MzMyfQ.YlcKTzPrYrgCpfjBl0609HxbpCjVajV4HCluOKSju_5eOGHDIT_Yhqfdrae6QP9H4edWtXiYDMQGuVDyC_BLxg", required = true, position = 1)
    private String token;
    @ApiModelProperty(notes = "Type Token",
            example = "Bearer", required = true, position = 2)
    private String typetoken;

    public AuthenticationResponse() {

    }

    public AuthenticationResponse(String token, String typetoken) {
        super();
        this.token = token;
        this.typetoken = typetoken;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTypetoken() {
        return typetoken;
    }

    public void setTypetoken(String typetoken) {
        this.typetoken = typetoken;
    }
}
