package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients //该注解不能是FeignClient
public class LeYouAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeYouAuthApplication.class);
    }

}
