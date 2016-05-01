package com.infy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
/**
 *
 * @author Yasin_Pathan
 */
public class Person {
    
    private String name;
    @Autowired
    @Qualifier(value="carBean1")
    private Car car;

    public Person() {
        System.out.println("Person() called");
    }
    
    public Person(Car car) {
        System.out.println("Person(Car car) called");
        this.car = car;
    }

    public void setName(String name) {
        System.out.println("PersonsetName(String name) called");
        this.name = name;
    }

    public void setCar(Car car) {
        System.out.println("setCar(Car car) called");
        this.car = car;
    }
    
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", car=" + car + '}';
    }
    
    
}
