package com.edu.share.designsh.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public String getDateFormat(Date date, String format) {
        String resultDate = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        resultDate = dateFormat.format(date);
        return resultDate;
    }
}
