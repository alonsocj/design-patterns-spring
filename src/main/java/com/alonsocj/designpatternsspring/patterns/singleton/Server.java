package com.alonsocj.designpatternsspring.patterns.singleton;

import org.springframework.stereotype.Component;

@Component
public class Server {

  private static Server instance;
  private static int port;
  final private static int DEFAULT_PORT = 8080;

  private Server() {}

  public static Server getInstance() {
    if (instance == null) {
      instance = new Server();
      port = DEFAULT_PORT;
    }
    return instance;
  }

  public int getPort() {
    return port;
  }
}
