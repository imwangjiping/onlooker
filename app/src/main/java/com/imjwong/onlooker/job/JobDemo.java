package com.imjwong.onlooker.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * JobDemo class
 *
 * @author J.Wong
 * @date 2018/01/19
 */
@Component
public class JobDemo {

    // @Scheduled(cron = "0 15 10 * * ?")  // 每天上午10时15分0秒
    @Scheduled(cron = "0/5 * * * * ?")    // 每5秒
    // @Scheduled(cron = "0 0/1 * * * ?")  // 每分钟一次
    // @Scheduled(cron = "0 30 0 * * ?")    // 每天凌晨0时30分0秒
    public void JobDemo() {

        System.out.println("job is running... ");

    }

}
