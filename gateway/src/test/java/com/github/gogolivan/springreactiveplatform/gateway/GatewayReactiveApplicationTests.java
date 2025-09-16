package com.github.gogolivan.springreactiveplatform.gateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class GatewayReactiveApplicationTests {

    @Test
    void contextLoads() {
    }

}
