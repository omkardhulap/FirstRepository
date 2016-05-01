package xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author Yasin_Pathan
 */
public class XmlMain {

    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("xml/beans.xml");
        
        XmlAdder adder1 = (XmlAdder) context.getBean("adder");
        
        System.out.println("Addition is "+adder1.addNum());
        
        adder1.setNum1(25);
        adder1.setNum2(50);
        
        System.out.println("Addition is "+adder1.addNum());

        XmlAdder adder2 = (XmlAdder) context.getBean("adder");
        System.out.println("Addition is "+adder2.addNum());
        
    }

}
