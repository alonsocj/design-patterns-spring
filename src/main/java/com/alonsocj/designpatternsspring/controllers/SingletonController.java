package com.alonsocj.designpatternsspring.controllers;

import com.alonsocj.designpatternsspring.patterns.singleton.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/singleton")
public class SingletonController {

  @GetMapping()
  public String getInstanceServer() {
    Server server;
    server = Server.getInstance();
    return "Page 1 - Server at port: "+server.getPort()+" Instance: "+server;
  }

  @GetMapping("/other")
  public String getOtherInstanceServer(){
    Server server2;
    server2 = Server.getInstance();
    return "Page 2 - Server at port: "+server2.getPort()+" Instance: "+server2;
  }
}
