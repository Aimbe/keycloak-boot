package com.java.keycloaktest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class KeycloakTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeycloakTestApplication.class, args);
    }

}
