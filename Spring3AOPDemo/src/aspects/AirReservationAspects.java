package aspects;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author Yasin_Pathan
 */ 
@Aspect
public class AirReservationAspects {
    
    @Before("execution(* aop.AirReservationImpl.bookTicket())")
    public void checkSeatsAvailability(JoinPoint jp){//JoinPoint jp 
        jp.getTarget();
        System.out.println("Checking Seats Availability");       
    }
    
    @AfterReturning("execution(* aop.AirReservationImpl.bookTicket())")
    public void updateSeats(){
        System.out.println("Number of seats left for new booking are ---");        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    @AfterThrowing(pointcut="execution(* aop.AirResvImpl.bookTicket())",throwing="ex")     
//    public void test(Throwable ex){
//        System.out.println("Sorry "+ex.getMessage());    
//    }
    
//    @Around("execution(* aop.AirResvImpl.bookTicket())")     
//    public void test(ProceedingJoinPoint jp,Throwable ex){
//        System.out.println("target ojbect "+jp.getTarget()); 
//        System.out.println("Sorry "+ex.getMessage());    
//        try {
//            jp.proceed();
//        } catch (Throwable ex1) {
//            Logger.getLogger(AirReservationAspects.class.getName()).log(Level.SEVERE, null, ex1);
//        }
//    }
    
   
}
