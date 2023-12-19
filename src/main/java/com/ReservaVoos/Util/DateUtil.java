package com.ReservaVoos.Util;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
@Component
public class DateUtil {
    public String formatDate(LocalDateTime localDateTime){
        return DateTimeFormatter.ofPattern("dd-MM-yyyy").format(localDateTime);
    }
    public LocalDateTime time(LocalDateTime localDateTime)throws Exception{
        if (localDateTime.isAfter(LocalDateTime.now())){
            throw new Exception("The date is incompatible with the current date");
        }
        return localDateTime;
    }
    public LocalDateTime departureTime(LocalDateTime localDateTime) throws Exception {
        formatDate(time(localDateTime));
        return localDateTime;
    }
}
