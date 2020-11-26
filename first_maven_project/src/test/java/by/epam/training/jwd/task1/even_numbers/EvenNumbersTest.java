package by.epam.training.jwd.task1.even_numbers;

import org.junit.Test;

import static by.epam.training.jwd.task1.even_numbers.EvenNumbers.hasTwoEvens;
import static org.junit.Assert.*;

public class EvenNumbersTest {

    @Test
    public void hasTwoEvens_NotEnoughEvens_false(){
        int a = 1;
        int b = 3;
        int c = 4;
        int d = 7;
        boolean expected = false;

        boolean actual = hasTwoEvens(a, b, c, d);

        assertEquals(expected, actual);
    }

    @Test
    public void hasTwoEvens_TwoEvens_true(){
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 7;
        boolean expected = true;

        boolean actual = hasTwoEvens(a, b, c, d);

        assertEquals(expected, actual);
    }

    @Test
    public void hasTwoEvens_MoreEvens_true(){
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 6;
        boolean expected = true;

        boolean actual = hasTwoEvens(a, b, c, d);

        assertEquals(expected, actual);
    }
}