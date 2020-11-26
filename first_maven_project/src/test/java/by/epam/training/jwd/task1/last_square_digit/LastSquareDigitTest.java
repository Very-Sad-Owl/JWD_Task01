package by.epam.training.jwd.task1.last_square_digit;

import org.junit.Test;

import static by.epam.training.jwd.task1.last_square_digit.LastSquareDigit.findLastDigitOfMathPow;
import static org.junit.Assert.*;

public class LastSquareDigitTest {

    @Test
    public void lastDigitOfMathPow_Of9_Is1(){
        int arg = 9;
        int expected = 1;

        int actual = findLastDigitOfMathPow(arg);

        assertEquals(expected, actual);
    }
    @Test
    public void lastDigitOfMathPow_Of4_Is6(){
        int arg = 4;
        int expected = 6;

        int actual = findLastDigitOfMathPow(arg);

        assertEquals(expected, actual);
    }
}