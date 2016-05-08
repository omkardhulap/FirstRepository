package com.infy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 *
 * @author Omkar
 */

@Component
public class Person {
    
    private String name="Omkar";
    
    @Autowired
    private Car car;

    
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", car=" + car + '}';
    }
    
    
       
}
