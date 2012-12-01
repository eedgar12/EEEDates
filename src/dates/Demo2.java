package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Emma Edgar
 */
public class Demo2 {

    public static void main(String[] args) {
        Date date1 = new Date();
        Calendar cal = Calendar.getInstance();
        Date date2 = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyy hh:mm a");
        TimeZone tz = cal.getTimeZone();
        
        
        
        System.out.println("Date: " + sdf.format(date1));
        System.out.println("Calendar: " + sdf.format(date2) + " " + 
                //full time zone
                tz.getDisplayName());
         
    }
}
