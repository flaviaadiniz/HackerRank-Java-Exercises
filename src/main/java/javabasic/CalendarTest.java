/*
You are given a date. You just need to write the method, findDay, which returns the day on that date.
 */

package javabasic;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class CalendarTest {

    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        return dayOfWeek.getDisplayName(TextStyle.FULL, Locale.US).toUpperCase();
    }

    public static void main(String[] args) {

        System.out.println(findDay(5,4, 1984));

    }

}
