package com.ReservaVoos.Util;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
@Component
public class DateUtil {
    public String formatLocalDateTimeToDatabaseStyle(LocalDateTime localDateTime){
        return DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(localDateTime);
    }
    public void departureTime(LocalDateTime localDateTime)throws Exception{
        if (localDateTime.isAfter(LocalDateTime.now())){
            throw new Exception("The date is incompatible with the current date");
        }
    }
}
