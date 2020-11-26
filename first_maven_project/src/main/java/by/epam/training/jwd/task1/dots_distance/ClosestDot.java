package by.epam.training.jwd.task1.dots_distance;

import by.epam.training.jwd.task1.custom_exception.NullRefInArgumentsException;

import static java.lang.Math.sqrt;

class ClosestDot {
    static int[] findClosestDot(int[] x, int[] y) throws NullRefInArgumentsException {
        if (x == null || y == null){
            throw new NullRefInArgumentsException();
        }
        return sqrt(x[0]*x[0] + x[1]*x[1]) < sqrt(y[0]*y[0] + y[1]*y[1]) ?
                x : y;
    }
}
