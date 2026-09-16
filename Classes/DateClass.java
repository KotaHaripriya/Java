package Classes;

import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current Date and Time: "+date.toString());
        System.out.println("Todays date : "+date.getDate());
        System.out.println("Todays day: "+date.getDay());
        System.out.println("Current month: "+date.getMonth());
        System.out.println("Current year: "+(date.getYear()+1900));
        System.out.println("Current Time: "+date.toGMTString());
        System.out.println("Current Seconds: "+date.getSeconds());
        System.out.println("Current Mins: "+date.getMinutes());
        System.out.println("Current Hr: "+date.getHours());
    }
}
