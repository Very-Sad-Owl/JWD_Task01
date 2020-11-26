package by.epam.training.jwd.task1.dots_distance;

import by.epam.training.jwd.task1.custom_exception.NullRefInArgumentsException;
import org.junit.Test;

import java.util.Arrays;

import static by.epam.training.jwd.task1.dots_distance.ClosestDot.findClosestDot;
import static org.junit.Assert.*;

public class ClosestDotTest {
    @Test
    public void findClosestDot_YCloserThanX_y() throws NullRefInArgumentsException {
        int[] x = {-4, -9};
        int[] y = {5, 6};
        int[] expected = Arrays.copyOf(y, y.length);

        int[] actual = findClosestDot(x, y);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findClosestDot_XCloserThanY_x() throws NullRefInArgumentsException {
        int[] x = {4, 9};
        int[] y = {5, 10};
        int[] expected = Arrays.copyOf(x, x.length);

        int[] actual = findClosestDot(x, y);

        assertArrayEquals(expected, actual);
    }

    @Test(expected = NullRefInArgumentsException.class)
    public void findClosestDot_IllegalArgs_Exception() throws NullRefInArgumentsException {
        int[] x = null;
        int[] y = null;

        findClosestDot(x, y);

    }

}