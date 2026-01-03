/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seleniumlogin;

import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import org.junit.jupiter.api.Test;

/**
 *
 * @author mahes
 */
public class TimeoutExample {

    @Test
    void timeoutTest() {
        assertTimeout(Duration.ofSeconds(2), () -> {
            Thread.sleep(1000);
        });
    }
}
