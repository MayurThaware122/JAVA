/*
 * This source file was generated by the Gradle 'init' task
 */
package com.example.gradleproject1;

public class App {
public static void main(String[] args) {
        Car c1 = new Car(2,"bmw",220);
        System.out.println("details:" + "\n" + "Car name:" + c1.getBrand()+" \n" +  "no of Doors:" + c1.doors + "\n" + "speed" +   c1.speed );
        Bike B1 = new Bike(false ,"Yamaha",160);
  
        System.out.println("""
                           Details:
                           speed :""" +  B1.getSpeed() + "\n"+ "Bike has a carrier : " +  B1.hasCarrier + "\n" + "Bike Brand name :  " +  B1.brand );
    }
}
