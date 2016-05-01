package clientAnnotation;

import com.infy.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 *
 * @author Yasin_Pathan
 */
public class AnnotationMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Person p = context.getBean(Person.class);
        System.out.println(p);
    }
    
   
}
