package com.nh.JobScheduler.task;

import java.time.LocalDateTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TaskThree {

    @Scheduled(fixedDelay = 2000)
      public void starteBatch() throws InterruptedException {
        if ("conditionVerified".equals("conditionVerified")) {
            log.info("TaskThree Batch ausführen :" + LocalDateTime.now());
            Thread.sleep(30000);

        }
    }
}
