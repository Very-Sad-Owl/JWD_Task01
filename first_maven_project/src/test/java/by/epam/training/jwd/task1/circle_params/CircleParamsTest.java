package by.epam.training.jwd.task1.circle_params;

import by.epam.training.jwd.task1.custom_exception.NegativeRadiusException;
import org.junit.Test;

import static org.junit.Assert.*;
import static by.epam.training.jwd.task1.circle_params.CircleParams.*;

public class CircleParamsTest {
    @Test
    public void findSquare_correctR_Result() throws NegativeRadiusException {
        double r = 8;
        double expected = 201.1;

        double actual = findSquare(r);

        assertEquals(expected, actual, 0.1);
    }

    @Test(expected = NegativeRadiusException.class)
    public void findSquare_IncorrectR_IllegalArgException() throws NegativeRadiusException {
        double r = -1;

        findSquare(r);
    }

    @Test
    public void findCircleLength_CorrectR_Result() throws NegativeRadiusException {
        double r = 3;
        double expected = 18.9;

        double actual = findCircleLength(r);

        assertEquals(expected, actual, 0.1);
    }

    @Test(expected = NegativeRadiusException.class)
    public void findCircleLength_IncorrectR_IllegalArgException() throws NegativeRadiusException {
        double r = -3;

        findCircleLength(r);
    }

    @Test
    public void findCircleParams_CorrectR_Result() throws NegativeRadiusException {
        double r = 3;
        double[] expected = {28.3, 18.9};

        double[] actual = findCircleParams(r);

        assertArrayEquals(expected, actual, 0.1);
    }

    @Test(expected = NegativeRadiusException.class)
    public void findCircleParams_IncorrectR_IllegalArgException() throws NegativeRadiusException {
        double r = -3;

        findCircleParams(r);
    }

}