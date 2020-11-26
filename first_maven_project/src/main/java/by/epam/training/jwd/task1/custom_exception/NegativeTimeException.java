package by.epam.training.jwd.task1.custom_exception;

public class NegativeTimeException extends Exception {
    public NegativeTimeException(){
        super("Time value can't be negative");
    }
}
