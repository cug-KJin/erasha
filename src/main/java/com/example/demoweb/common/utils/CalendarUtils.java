package com.example.demoweb.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarUtils {
    public static String getDateTime(){
        Date CurrentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        return formatter.format(CurrentDate);
    }
}
