package by.epam.training.jwd.task1.perfect_numbers;

import org.junit.Test;

import static by.epam.training.jwd.task1.perfect_numbers.PerfectNumbers.isPerfect;
import static org.junit.Assert.*;

public class PerfectNumbersTest {

    @Test
    public void isPerfect_Perfect_True(){
        int num = 6;
        boolean expected = true;

        boolean actual = isPerfect(num);

        assertEquals(expected, actual);
    }

    @Test
    public void isPerfect_NotPerfect_False(){
        int num = 12;
        boolean expected = false;

        boolean actual = isPerfect(num);

        assertEquals(expected, actual);
    }
}