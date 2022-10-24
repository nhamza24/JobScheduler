package com.nh.JobScheduler.task;

import java.time.LocalDateTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TaskTwo {


    @Scheduled(fixedRate = 3000)
    public void starteBatch() {
        if ("conditionVerified".equals("conditionVerified")) {
            log.info("TaskTwo Batch ausführen :" + LocalDateTime.now());
        }
    }
}

