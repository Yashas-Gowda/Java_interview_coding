package JavaInterviewQuestions.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {
        Date d = new Date(); // Date class gives todays date in  Wed Apr 09 05:55:21 IST 2025
        System.out.println("Todays date is : " + d.toString());
        // To format default class there is SimpleDateFormat class
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/YYYY");
        System.out.println(sdf.format(d)); // format d object into sdf object format
        SimpleDateFormat sdf1 = new SimpleDateFormat("d/M/YYYY HH:MM:SS");
        System.out.println(sdf1.format(d));

    }
}
