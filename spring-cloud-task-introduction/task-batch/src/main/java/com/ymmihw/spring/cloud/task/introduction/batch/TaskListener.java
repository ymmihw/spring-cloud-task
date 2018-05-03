package com.ymmihw.spring.cloud.task.introduction.batch;

import java.util.logging.Logger;
import org.springframework.cloud.task.listener.TaskExecutionListener;
import org.springframework.cloud.task.repository.TaskExecution;
import org.springframework.stereotype.Component;

@Component
public class TaskListener implements TaskExecutionListener {

  private final static Logger LOGGER = Logger.getLogger(TaskListener.class.getName());

  @Override
  public void onTaskEnd(TaskExecution arg0) {
    // TODO Auto-generated method stub
    LOGGER.info("End of Task");
  }

  @Override
  public void onTaskFailed(TaskExecution arg0, Throwable arg1) {
    // TODO Auto-generated method stub

  }

  @Override
  public void onTaskStartup(TaskExecution arg0) {
    // TODO Auto-generated method stub
    LOGGER.info("Task Startup");
  }
}
