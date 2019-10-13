package com.sessionui.version1.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class SignUpUserDTO implements Serializable {
    private String username;
    private String password;

}
