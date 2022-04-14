package com.moran.controller.d_convent;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class DateConverter implements Converter<String,Date> {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/MM/dd");


    @Override
    public Date convert(String s) {
        Date date = null;
        try {
            date = simpleDateFormat.parse(s);
        } catch (ParseException e) {
            try {
                date = simpleDateFormat2.parse(s);
            } catch (ParseException e1) {
                e1.printStackTrace();
            }
        }
        return date;
    }


}
