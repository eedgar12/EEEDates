package dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Emma Edgar
 */
public class DateTimeFormat {

    public String dateToString(Date d, SimpleDateFormat df){
        String date = df.format(d);
        return date;
    }
    
    public Date stringToDate(String s, SimpleDateFormat df) throws ParseException {
        return df.parse(s);
    }
}
