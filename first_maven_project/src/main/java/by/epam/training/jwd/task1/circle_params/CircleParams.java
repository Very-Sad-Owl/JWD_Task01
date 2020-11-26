package by.epam.training.jwd.task1.circle_params;

import by.epam.training.jwd.task1.custom_exception.NegativeRadiusException;

import static java.lang.Math.PI;

class CircleParams {

    static double findSquare(double radius) throws NegativeRadiusException {
        if(radius < 0){
            throw new NegativeRadiusException();
        }
        return PI * radius * radius;
    }

    static double findCircleLength(double radius) throws NegativeRadiusException {
        if(radius < 0){
            throw new NegativeRadiusException();
        }
        return 2 * PI * radius;
    }

    /*
    returns double array having length = 2, where
    array[0] - square of a circle
    array[1] - circle's length
     */
    static double[] findCircleParams(double radius) throws NegativeRadiusException {
        return new double[]{findSquare(radius), findCircleLength(radius)};
    }

}
