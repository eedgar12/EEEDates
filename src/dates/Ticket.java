package dates;

import hirondelle.date4j.DateTime;
import java.util.Date;

/**
 *
 * @author Emma Edgar
 */
public class Ticket {

    private Date arrivalTime;
    private Date departureTime;
    private double hoursParked;
    
    public void activateTicket(){
        arrivalTime = new Date(2012, 11, 8, 13, 3);
    }
    
    public void checkout(){
        activateTicket();
        departureTime = new Date(2012, 11, 8, 14, 53);
        long start = arrivalTime.getTime(); //msec since 1970
        long end = departureTime.getTime();
//        long duration = arrivalTime.numSecondsFrom(departureTime);
        
        
        
        long duration = end - start;
        duration = duration / 1000 / 60;
        hoursParked = (double)duration / 60;
        System.out.println(hoursParked);
    }
    
    
    public static void main(String[] args) {
        Ticket t = new Ticket();
        t.checkout();
    }
    
}
