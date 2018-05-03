package com.ymmihw.spring.cloud.task.introduction.batch;

import java.util.logging.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableTask
public class TaskDemo {

  private final static Logger LOGGER = Logger.getLogger(TaskDemo.class.getName());

  public static void main(String[] args) {
    SpringApplication.run(TaskDemo.class, args);
  }

  @Component
  public static class HelloWorldApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments arg0) throws Exception {
      LOGGER.info("Hello World from Spring Cloud Task!");
    }
  }
}
