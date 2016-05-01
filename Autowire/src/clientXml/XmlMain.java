package clientXml;

import com.infy.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
/**
 *
 * @author Yasin_Pathan
 */
public class XmlMain {

    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("clientXml/Config.xml"));
        Person p = (Person) factory.getBean("personBean");
        System.out.println(p);
    }
}
