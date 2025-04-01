/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject1;

/**
 *
 * @author mthaw
 */
public class Car extends Vehicle {
     int doors;

    public Car(int doors,String brand, int speed) {
        super(brand, speed);
        this.doors = doors;
    }
     
    
}
