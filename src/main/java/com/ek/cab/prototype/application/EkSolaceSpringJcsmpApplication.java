package com.ek.cab.prototype.application;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.ek.cab")
@SpringBootApplication
public class EkSolaceSpringJcsmpApplication {


    private static final Logger log = LogManager.getLogger(EkSolaceSpringJcsmpApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EkSolaceSpringJcsmpApplication.class, args);
        log.info("start App.....");
    }
}