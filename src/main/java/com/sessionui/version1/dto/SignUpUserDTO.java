package com.sessionui.version1.dto;

import lombok.Data;
import java.io.Serializable;


public class SignUpUserDTO implements Serializable {
    private String username;
    private String password;

  public SignUpUserDTO() {
  }

  public SignUpUserDTO(String username, String password) {
    this.username = username;
    this.password = password;
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
