package com.feri.mybatisplus_sys.convert;

import org.springframework.core.convert.converter.Converter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *@Author feri
 *@Date Created in 2019/3/21 14:57
 */
public class DateConvert implements Converter<String,Date> {
    @Override
    public Date convert(String s) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

        try {
            return sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
