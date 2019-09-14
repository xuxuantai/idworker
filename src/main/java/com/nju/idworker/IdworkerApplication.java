package com.nju.idworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class IdworkerApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdworkerApplication.class, args);
    }

}
