package clientAnnotation;

import com.infy.Car;
import com.infy.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Yasin_Pathan
 */
@Configuration
public class Config {
    
    @Bean(name="carBean1")
    public Car getHondaCityCar(){
        Car c = new Car("Honda City","Silver");
        return c;
    }
    
    @Bean(name="carBean2")
    public Car getCarAltoCar(){
        Car c = new Car("Alto k10","White");
        return c;
    }
    
    @Bean(name="personBean")
    public Person getPerson(){
        Person p = new Person();
        p.setName("Vivek");
        return p;
    }
    
}
