package org.example.tool;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUnit {
    public static String getISO8601Timestamp(Date date) {
        TimeZone tz = TimeZone.getTimeZone("");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        df.setTimeZone(tz);
        String nowAsISO = df.format(date);
        System.out.println(nowAsISO);
        return nowAsISO;

    }

    public static Date StrToDate(String str) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Date date = null;
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static void main(String[] args) {
        var dd = DateUnit.StrToDate("2021/4/2 10:16");
        DateUnit.getISO8601Timestamp(dd);
    }
}