package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@ApiModel(description = "The results return after user authenticate by jwt token successful")
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "ID can't be null")
    private long id;
    @Column
    @ApiModelProperty(notes = "username of user in \"users\" tables",
            example = "user_1", required = true, position = 1)
    private String username;
    @Column
    @ApiModelProperty(notes = "password encoder of user in \"users\" tables",
            example = "$2a$10$3s/0R/ennPRczL2OQGIaWeq4Nzlivafw/I19dbjy7CCkS2yKVn8dG", required = true, position = 2)
    private String password;
    @Column
    @ApiModelProperty(notes = "role of user in \"users\" tables",
            example = "ROLE_ADMIN", required = true, position = 3)
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

}
