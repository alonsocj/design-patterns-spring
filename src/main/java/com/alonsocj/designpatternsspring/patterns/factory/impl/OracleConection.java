package com.alonsocj.designpatternsspring.patterns.factory.impl;

import com.alonsocj.designpatternsspring.patterns.factory.inter.IConection;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("oracle")
public class OracleConection implements IConection {

  private String host;
  private String port;
  private String user;
  private String password;

  public OracleConection(){
    this.host = "localhost";
    this.port = "1521";
    this.user = "admin";
    this.password = "123";
  }

  @Override
  public String connect() {
    return "Connecting to Oracle";
  }

  @Override
  public String disconnect() {
    return "Disconnecting from Oracle";
  }
}
