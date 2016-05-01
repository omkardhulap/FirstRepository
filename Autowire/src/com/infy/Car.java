package com.infy;
/**
 *
 * @author Yasin_Pathan
 */
public class Car {
    
    private String model;
    private String color;

    public Car(String model, String color) {
        System.out.println("Car(String model, String color) called");
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" + "model=" + model + ", color=" + color + '}';
    }
    
}
