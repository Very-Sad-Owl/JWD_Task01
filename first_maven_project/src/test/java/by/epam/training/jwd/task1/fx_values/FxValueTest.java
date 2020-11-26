package by.epam.training.jwd.task1.fx_values;

import org.junit.Test;

import static by.epam.training.jwd.task1.fx_values.FxValue.findFx;
import static org.junit.Assert.*;

public class FxValueTest {

    @Test
    public void findFx_3_9(){
        double x = 3;
        double expected = 9;

        double actual = findFx(x);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void findFx_2_0dot5(){
        double x = 2;
        double expected = 0.5;

        double actual = findFx(x);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void findFx_neg1_0dot14(){
        double x = -1;
        double expected = -1.0/7.0;

        double actual = findFx(x);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void findFx_8_neg31(){
        double x = 8;
        double expected = -31;

        double actual = findFx(x);

        assertEquals(expected, actual, 0.001);
    }

}