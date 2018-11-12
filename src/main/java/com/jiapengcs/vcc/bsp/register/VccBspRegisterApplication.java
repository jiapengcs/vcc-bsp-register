package com.jiapengcs.vcc.bsp.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Jiapeng
 * @version V1.0
 * @date: 2018/11/12
 */
@EnableEurekaServer
@SpringBootApplication
public class VccBspRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(VccBspRegisterApplication.class, args);
    }
}
