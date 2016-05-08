package com.infy;

import org.springframework.stereotype.Component;

/**
 *
 * @author Omkar
 */

@Component
public class Car {
    
    private String model="Honda Accord";    
    private String color="Black";

    @Override
    public String toString() {
        return "Car{" + "model=" + model + ", color=" + color + '}';
    }
                 
}
