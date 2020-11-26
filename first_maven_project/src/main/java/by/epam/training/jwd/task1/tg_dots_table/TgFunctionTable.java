package by.epam.training.jwd.task1.tg_dots_table;

import by.epam.training.jwd.task1.custom_exception.NullRefInArgumentsException;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.tan;


public class TgFunctionTable {
    private List<Double> xValues;
    private List<Double> yValues;

    List<Double> getxValues() {
        return xValues;
    }

    List<Double> getyValues() {
        return yValues;
    }

    void setxValues(List<Double> xValues) {
        this.xValues = xValues;
    }

    private double findFxValue(double x){
        return tan(x);
    }

    public void findXValues(double a, double b, double h){
        xValues = new ArrayList<>();
        double until =  b >= a ? ++b : --b;
        for (double i = a; i != until; i+=h){
            xValues.add(i);
        }
    }

    public void findYValues() throws NullRefInArgumentsException {
        if (xValues == null){
            throw new NullRefInArgumentsException();
        }
        yValues = new ArrayList<>();
        for (double x : xValues) {
            yValues.add(findFxValue(x));
        }
    }

    public void drawTable(){
        System.out.println("    x     |      y  \n");
        for (int i = 0; i < xValues.size(); i++){
            String spacingBefore = "        ";
            spacingBefore = spacingBefore.substring(0, 8 - xValues.get(i).toString().length());

            System.out.printf("%.3f%s|%s%.3f\n", xValues.get(i), spacingBefore, spacingBefore, yValues.get(i));
        }
    }

}
