package com.alonsocj.designpatternsspring.patterns.factory.impl;

import com.alonsocj.designpatternsspring.patterns.factory.inter.IConection;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class EmptyConection implements IConection {

  @Override
  public String connect() {
    return "Don't set a database engine";
  }

  @Override
  public String disconnect() {
    return "Don't set a database engine";
  }
}
