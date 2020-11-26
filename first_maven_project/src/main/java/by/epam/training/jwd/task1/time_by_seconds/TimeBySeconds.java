package by.epam.training.jwd.task1.time_by_seconds;

import by.epam.training.jwd.task1.custom_exception.NegativeTimeException;

class TimeBySeconds {
    static String printCurrentTime(int secondsFromMidnight) throws NegativeTimeException {
        if (secondsFromMidnight < 0){
            throw new NegativeTimeException();
        }
        return String.format("%d hours %d minutes %d seconds",
                secondsFromMidnight / 3600,
                secondsFromMidnight % 3600 / 60,
                secondsFromMidnight % 60);
    }
}
