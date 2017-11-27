package aop;
/**AirReservation
 *
 * @author Yasin_Pathan
 */
public class AirReservationImpl implements AirReservation{

    @Override
    public void bookTicket() {  
        //checkSeatsAvailability();
        System.out.println("You have booked seats");
        //updateSeats();
        
    }
    
}


//checkSeatsAvailability();
//updateSeats();
        //throw new RuntimeException("Required number of seats are not available");