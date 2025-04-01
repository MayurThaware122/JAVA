/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject1;

/**
 *
 * @author mthaw
 */
public class Bike extends Vehicle {
     boolean hasCarrier;

    public Bike(boolean hasCarrier, String brand, int speed) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }
     
    
    
}
