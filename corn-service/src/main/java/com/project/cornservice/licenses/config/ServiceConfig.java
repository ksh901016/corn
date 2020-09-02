package com.project.cornservice.licenses.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {

  @Value("${spring.datasource.username}")
  private String decryptedUserName;

  public String getDecryptedUserName(){
    return decryptedUserName;
  }
}
