package com.alonsocj.designpatternsspring.patterns.factory;

import com.alonsocj.designpatternsspring.patterns.factory.impl.EmptyConection;
import com.alonsocj.designpatternsspring.patterns.factory.impl.MySQLConection;
import com.alonsocj.designpatternsspring.patterns.factory.impl.OracleConection;
import com.alonsocj.designpatternsspring.patterns.factory.inter.IConection;
import org.springframework.stereotype.Component;

@Component
public class FactoryConection {

  public IConection getConection(String engine){
    if(engine == null){
      return new EmptyConection();
    }
    if(engine.equalsIgnoreCase("MYSQL")){
      return new MySQLConection();
    }
    if(engine.equalsIgnoreCase("ORACLE")){
      return new OracleConection();
    }
    return new EmptyConection();
  }
}
