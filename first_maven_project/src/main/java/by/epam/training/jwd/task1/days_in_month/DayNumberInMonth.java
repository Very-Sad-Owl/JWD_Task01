package by.epam.training.jwd.task1.days_in_month;

import by.epam.training.jwd.task1.custom_exception.IllegalDatePartException;

class DayNumberInMonth {
    static int findDaysInMonth(int month, int year) throws IllegalDatePartException {

        if (month < 1 || month > 12 || year < 1){
            throw new IllegalDatePartException();
        }

        if (isLeapYear(year)){
            return month != 2 ? 30 + (month + month/8) % 2 : 28;
        } else {
            return month != 2 ? 30 + (month + month/8) % 2 : 29;
        }
    }

   static boolean isLeapYear(int year) throws IllegalDatePartException {
        if (year < 1){
            throw new IllegalDatePartException();
        }
        return !(year % 4 != 0 || year % 100 == 0 && year % 400 != 0);
    }
}
