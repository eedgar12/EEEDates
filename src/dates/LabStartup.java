package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Emma Edgar
 */
public class LabStartup {

    public static void main(String[] args) {
        DateTimeFormat dtf = new DateTimeFormat();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyy");
        Date d = new Date();

        System.out.println(dtf.dateToString(d, sdf));


    }
}
