package org.example.ryan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RyanApplication {

    private static final Logger logger = LoggerFactory.getLogger(RyanApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RyanApplication.class, args);

        System.out.println("ryan启动成功！");
        logger.info("ryan启动成功");
    }

}
