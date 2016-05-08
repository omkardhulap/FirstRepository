package client;

import com.infy.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author Omkar
 */
public class ClientMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Person p = context.getBean(Person.class);
        
        System.out.println(p);
    }
}
