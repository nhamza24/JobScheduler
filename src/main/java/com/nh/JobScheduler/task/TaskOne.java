package com.nh.JobScheduler.task;

import java.time.LocalDateTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TaskOne {

    @Scheduled(cron = "${task.task-one.start-expression:0/5 * * * * *}")
    //@Scheduled(cron = "0/5 * * * * *")
        public void starteBatch() {
        if ("conditionVerified".equals("conditionVerified")) {
            log.info("TaskOne Batch ausführen :" + LocalDateTime.now());
        }
    }
}
