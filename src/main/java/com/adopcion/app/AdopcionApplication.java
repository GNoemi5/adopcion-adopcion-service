package com.adopcion.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EntityScan(basePackages= {"com.adopcion.app.domain.donacion.entities"})
public class AdopcionApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdopcionApplication.class, args);
    }

}
