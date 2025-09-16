package com.github.gogolivan.springreactiveplatform.filestore;

import org.springframework.boot.SpringApplication;

public class TestFilestoreApplication {

    public static void main(String[] args) {
        SpringApplication.from(FilestoreReactiveApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
