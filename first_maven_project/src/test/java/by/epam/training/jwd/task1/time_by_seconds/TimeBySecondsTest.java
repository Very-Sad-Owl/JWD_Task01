package by.epam.training.jwd.task1.time_by_seconds;

import by.epam.training.jwd.task1.custom_exception.NegativeTimeException;
import org.junit.Test;

import static by.epam.training.jwd.task1.time_by_seconds.TimeBySeconds.printCurrentTime;
import static org.junit.Assert.*;

public class TimeBySecondsTest {
    @Test
    public void findTimeBySeconds_5600_15h33m20s() throws NegativeTimeException {
        int second = 56_000;
        String expected = "15 hours 33 minutes 20 seconds";

        String actual = printCurrentTime(second);

        assertEquals(expected, actual);
    }

    @Test(expected = NegativeTimeException.class)
    public void findTimeBySeconds_IncorrectArgs_Exception() throws NegativeTimeException {
        int second = -5;

        printCurrentTime(second);
    }
}
