/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seleniumlogin;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 *
 * @author mahes
 */
public class ExceptionTestExample {

    @Test
    void exceptionTest() {
        assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0;
        });
    }
}

