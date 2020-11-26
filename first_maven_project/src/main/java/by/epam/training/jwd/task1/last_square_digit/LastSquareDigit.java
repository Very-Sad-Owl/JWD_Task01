package by.epam.training.jwd.task1.last_square_digit;

class LastSquareDigit {
    static int findLastDigitOfMathPow(int num){
        return (num % 10) * (num % 10) % 10;
    }
}
