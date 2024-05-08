package com.nado.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserCreateRequestDTO {

    private String email;
    private String password;
    private String nickname;
    private String role;
    private String status;
    private Boolean emailVerified;
}
