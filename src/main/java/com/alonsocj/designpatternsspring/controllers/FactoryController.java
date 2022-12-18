package com.alonsocj.designpatternsspring.controllers;

import com.alonsocj.designpatternsspring.patterns.factory.FactoryConection;
import com.alonsocj.designpatternsspring.patterns.factory.inter.IConection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factory")
public class FactoryController {

  @Autowired
  private FactoryConection factory;
  @Autowired
  private IConection conection;

  @GetMapping("/{type}")
  public String getConection(@PathVariable String type) {
      conection = factory.getConection(type);
      return conection.connect();
  }
  @GetMapping
  public String getEmptyConection(){
    return conection.connect();
  }

  @GetMapping("/disconect/{type}")
  public String getDisconnect(@PathVariable String type) {
      conection = factory.getConection(type);
      return conection.disconnect();
  }
}
