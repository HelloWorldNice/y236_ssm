package cn.bdqn.converter;


import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// 字符串向日期的转换
public class String2Date implements Converter<String, Date> {

    @Override
    public Date convert(String source) {

        if (source == null || "".equals(source.trim())) {
            return null;
        }

        // 2020/09/09
        // 2020.10.10
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = df.parse(source);
        } catch (ParseException e) {
            df = new SimpleDateFormat("yyyy/MM/dd");
            try {
                date = df.parse(source);
            } catch (ParseException ex) {
                df = new SimpleDateFormat("yyyy.MM.dd");
                try {
                    date = df.parse(source);
                } catch (ParseException exc) {
                    throw new RuntimeException(exc);
                }
            }
        }
        return date;
    }
}
