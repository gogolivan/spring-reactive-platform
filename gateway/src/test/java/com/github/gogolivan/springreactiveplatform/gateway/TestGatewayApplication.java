package com.github.gogolivan.springreactiveplatform.gateway;

import org.springframework.boot.SpringApplication;

public class TestGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.from(GatewayReactiveApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
