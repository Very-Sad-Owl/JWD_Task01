package by.epam.training.jwd.task1.tg_dots_table;

import by.epam.training.jwd.task1.custom_exception.NullRefInArgumentsException;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TgFunctionTableTest {

    TgFunctionTable tgFunction;

    @Before
    public void setUp(){
        tgFunction = new TgFunctionTable();
    }

   @Test
   public void findXValues_fromOneToThreeWithStep1_listFromOneToThree(){
       double a = 1;
       double b = 3;
       double h = 1;
       List<Double> expected = new ArrayList<>();
       expected.add(1.0);
       expected.add(2.0);
       expected.add(3.0);

       tgFunction.findXValues(a, b , h);
       List<Double> actual = tgFunction.getxValues();

       assertEquals(expected, actual);
    }

    @Test
    public void findXValues_fromOneToOneWithStep1_listWithOne(){
        double a = 1;
        double b = 1;
        double h = 1;
        List<Double> expected = new ArrayList<>();
        expected.add(1.0);

        tgFunction.findXValues(a, b , h);
        List<Double> actual = tgFunction.getxValues();

        assertEquals(expected, actual);
    }

    @Test
    public void findXValues_fromOneToNegOneWithStepNegOne_fromOneToNegOne(){
        double a = 1;
        double b = -1;
        double h = -1;
        List<Double> expected = new ArrayList<>();
        expected.add(1.0);
        expected.add(0.0);
        expected.add(-1.0);

        tgFunction.findXValues(a, b , h);
        List<Double> actual = tgFunction.getxValues();

        assertEquals(expected, actual);
    }

    @Test
    public void findYValues_ListOfThreeElements_resultListOfThreeElements() throws NullRefInArgumentsException {
       List<Double> xValues = new ArrayList<>();
       xValues.add(1.0);
       xValues.add(2.0);
       xValues.add(3.0);
       tgFunction.setxValues(xValues);
       List<Double> expected = new ArrayList<>();
       expected.add(1.5574077246549023);
       expected.add(-2.185039863261519);
       expected.add(-0.1425465430742778);

       tgFunction.findYValues();
       List<Double> actual = tgFunction.getyValues();

       assertEquals(expected, actual);
    }

    @Test(expected = NullRefInArgumentsException.class)
    public void findYValues_nullList_Exception() throws NullRefInArgumentsException {
        List<Double> xValues = null;
        tgFunction.setxValues(xValues);

        tgFunction.findYValues();
    }

}