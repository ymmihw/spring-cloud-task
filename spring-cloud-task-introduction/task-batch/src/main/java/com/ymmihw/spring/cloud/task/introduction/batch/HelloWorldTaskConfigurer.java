package com.ymmihw.spring.cloud.task.introduction.batch;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.task.configuration.DefaultTaskConfigurer;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldTaskConfigurer extends DefaultTaskConfigurer {

  @Autowired
  public HelloWorldTaskConfigurer(DataSource dataSource) {
    super(dataSource);
  }
}
