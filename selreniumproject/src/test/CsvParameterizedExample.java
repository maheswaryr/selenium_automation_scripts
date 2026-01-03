/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seleniumlogin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author mahes
 */
public class CsvParameterizedExample {

    @ParameterizedTest
    @CsvSource({
        "10, 20, 30",
        "5, 5, 10",
        "2, 3, 5"
    })
    void testAddition(int a, int b, int expected) {
        assertEquals(expected, a + b);
    }
}

