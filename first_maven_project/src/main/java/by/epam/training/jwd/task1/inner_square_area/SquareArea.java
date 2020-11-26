package by.epam.training.jwd.task1.inner_square_area;

import by.epam.training.jwd.task1.custom_exception.NegativeSquareException;

class SquareArea {

    static double findInnerSquareArea(double s) throws NegativeSquareException {
        if (s < 0){
            throw new NegativeSquareException();
        }
        return s / 2;
    }
}
