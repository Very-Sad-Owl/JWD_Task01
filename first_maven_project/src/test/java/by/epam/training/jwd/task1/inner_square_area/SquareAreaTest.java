package by.epam.training.jwd.task1.inner_square_area;

import by.epam.training.jwd.task1.custom_exception.NegativeSquareException;
import org.junit.Test;

import static by.epam.training.jwd.task1.inner_square_area.SquareArea.*;
import static org.junit.Assert.*;

public class SquareAreaTest {
    @Test
    public void findInnerSquareArea_16_8() throws NegativeSquareException {
        double square = 16;
        double expected = 8;

        double actual = findInnerSquareArea(square);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void findInnerSquareArea_0_0() throws NegativeSquareException {
        double square = 0;
        double expected = 0;

        double actual = findInnerSquareArea(square);

        assertEquals(expected, actual, 0.001);
    }

    @Test(expected = NegativeSquareException.class)
    public void findInnerSquareArea_IllegalArgs_Exception() throws NegativeSquareException {
        double square = -1;

        findInnerSquareArea(square);
    }

}