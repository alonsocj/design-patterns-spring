package com.alonsocj.designpatternsspring.patterns.factory.impl;

import com.alonsocj.designpatternsspring.patterns.factory.inter.IConection;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mysql")
public class MySQLConection implements IConection {

  private String host;
  private String port;
  private String user;
  private String password;

  public MySQLConection() {
    this.host = "localhost";
    this.port = "3306";
    this.user = "root";
    this.password = "123";
  }
  @Override
  public String connect() {
    return "Connecting to MySQL";
  }

  @Override
  public String disconnect() {
    return "Disconnecting from MySQL";
  }
}
