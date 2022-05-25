package com.devmountain.currentdate;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class WorldClock {
    LocalDateTime DateTime = LocalDateTime.now();

    public LocalDate getNowForDate() {
        LocalDate myDateObj = LocalDate.now();
        return myDateObj;}
    public LocalDateTime getNowForDateAndTime() {
        return DateTime;
    }

    public DayOfWeek getDayOfWeekForNow() {


        return DateTime.getDayOfWeek();
    }

    public int getDayOfMonthForNow() {
        return DateTime.getDayOfMonth();
    }

    public int getDayOfYearForNow() {
        return DateTime.getDayOfYear();
    }

    public ZonedDateTime getNowDateTimeForNewYork() {

      ZoneId Nypd =  ZoneId.of("EST", ZoneId.SHORT_IDS);
       return ZonedDateTime.now(Nypd);


    }

    public ZonedDateTime getNowDateTimeForLA() {
        String Abriv = "PST";
        ZoneId lapd =  ZoneId.of(Abriv, ZoneId.SHORT_IDS);
        return ZonedDateTime.now(lapd);


    }

    public ZonedDateTime getNowDateTimeForLondon() {
        String Abriv = "BST";
        ZoneId biscut =  ZoneId.of(Abriv, ZoneId.SHORT_IDS);
        return ZonedDateTime.now(biscut);

    }

    public ZonedDateTime getNowDateTimeForMoscow() {
        String Abriv = "MST";
        ZoneId Russ =  ZoneId.of(Abriv, ZoneId.SHORT_IDS);
        return ZonedDateTime.now(Russ);
    }

    public ZonedDateTime getNowDateTimeForTokyo() {
        String Abriv = "JST";
        ZoneId Anime =  ZoneId.of(Abriv, ZoneId.SHORT_IDS);
        return ZonedDateTime.now(Anime);
    }


}
