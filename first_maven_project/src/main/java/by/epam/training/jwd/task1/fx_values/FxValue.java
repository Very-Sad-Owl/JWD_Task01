package by.epam.training.jwd.task1.fx_values;

class FxValue {
    static int BORDER = 3;


    static double findFx(double x){
        double res;
        if (x >= BORDER){
            res = -(x * x) + 3 * x + 9;
        } else {
            res = 1 / (x * x * x - 6);
        }
        return res;
    }
}
