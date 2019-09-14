package com.nju.idworker.scheduled;

import com.nju.idworker.service.IdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by XXT on 2019/9/14.
 */
@Component
public class ScheduledTask {
    @Autowired
    private IdService idService;


    public void testGenerateId() {
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            System.out.println(idService.getId());
        }
        long endTime = System.nanoTime();
        System.out.println("耗时" + (endTime - startTime) / 1000000 + "ms");

    }

}
