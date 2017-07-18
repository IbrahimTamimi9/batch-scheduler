package com.asofdate.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hzwy23 on 2017/7/10.
 */
public class TimeFormat {

    public static String formatTime(String as_of_date) {
        SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        if (as_of_date == null || as_of_date.isEmpty()) {
            return as_of_date;
        }
        try {
            Date date = sdfTime.parse(as_of_date);
            return sdfTime.format(date);
        } catch (ParseException e) {
            System.out.println("as_of_date type is not yyyy-MM-dd HH:mm:ss," + as_of_date + "," + e.getMessage());
            return as_of_date;
        }
    }

    public static String formatDate(String as_of_date) {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");

        if (as_of_date == null || as_of_date.isEmpty()) {
            return as_of_date;
        }
        try {
            Date date = sdfDate.parse(as_of_date);
            return sdfDate.format(date);
        } catch (ParseException e) {
            System.out.println("as_of_date type is not yyyy-MM-dd," + as_of_date + "," + e.getMessage());
            return as_of_date;
        }
    }

}
