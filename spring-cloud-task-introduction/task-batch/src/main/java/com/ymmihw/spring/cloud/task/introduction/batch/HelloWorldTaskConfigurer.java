package com.ymmihw.spring.cloud.task.introduction.batch;

import javax.sql.DataSource;
import org.springframework.cloud.task.configuration.DefaultTaskConfigurer;

public class HelloWorldTaskConfigurer extends DefaultTaskConfigurer {

  public HelloWorldTaskConfigurer(DataSource dataSource) {
    super(dataSource);
  }
}
