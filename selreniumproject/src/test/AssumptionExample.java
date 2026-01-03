/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seleniumlogin;

import static org.junit.jupiter.api.Assumptions.assumeTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author mahes
 */
public class AssumptionExample {

    @Test
    void runOnlyIfConditionTrue() {
        assumeTrue(System.getProperty("os.name").contains("Windows"));
        System.out.println("Executed only on Windows");
    }
}

