package com.study.mvc20220927leeyw.controller.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class UserReqDto {
    private String username;
    private String password;
    private String name;
    private String email;
}
