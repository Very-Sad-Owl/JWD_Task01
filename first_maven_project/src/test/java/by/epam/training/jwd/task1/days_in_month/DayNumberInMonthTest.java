package by.epam.training.jwd.task1.days_in_month;

import by.epam.training.jwd.task1.custom_exception.IllegalDatePartException;
import org.junit.Test;

import static by.epam.training.jwd.task1.days_in_month.DayNumberInMonth.*;
import static org.junit.Assert.*;

public class DayNumberInMonthTest {
   @Test
    public void findDaysInMonth_MayNonLeap_31() throws IllegalDatePartException {
        int year = 2021;
        int month = 5;
        int expected = 31;

        int actual = findDaysInMonth(month, year);

        assertEquals(expected, actual);
    }

    @Test
    public void findDaysInMonth_FebNonLeap_28() throws IllegalDatePartException {
        int year = 2021;
        int month = 2;
        int expected = 29;

        int actual = findDaysInMonth(month, year);

        assertEquals(expected, actual);
    }

    @Test
    public void findDaysInMonth_NovLeap_30() throws IllegalDatePartException {
        int year = 2020;
        int month = 11;
        int expected = 30;

        int actual = findDaysInMonth(month, year);

        assertEquals(expected, actual);
    }

    @Test
    public void findDaysInMonth_FebLeap_29() throws IllegalDatePartException {
        int year = 2020;
        int month = 2;
        int expected = 28;

        int actual = findDaysInMonth(month, year);

        assertEquals(expected, actual);
    }

    @Test
    public void isLeapYear_2020_True() throws IllegalDatePartException {
       int year = 2020;
       boolean expected = true;

        boolean actual = isLeapYear(year);

        assertEquals(expected, actual);
    }

    @Test
    public void isLeapYear_2021_False() throws IllegalDatePartException {
        int year = 2021;
        boolean expected = false;

        boolean actual = isLeapYear(year);

        assertEquals(expected, actual);
    }

    @Test(expected = IllegalDatePartException.class)
    public void isLeapYear_neg1998_Exception() throws IllegalDatePartException {
        int year = -2020;

        isLeapYear(year);
    }

}