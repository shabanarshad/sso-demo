package com.baeldung.client;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = { SSOClientApplication2.class })
public class ContextIntegrationTest {

    @Test
    public void whenLoadApplication_thenSuccess() {
    }

}
