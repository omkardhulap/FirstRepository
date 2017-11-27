package client;

import aop.AirReservation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author Yasin_Pathan
 */
public class AOPClientMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aopConfig.xml");
        AirReservation resv = (AirReservation) context.getBean("resv");
        resv.bookTicket();
    }
}
