package by.epam.training.jwd.task1.custom_exception;

public class NegativeRadiusException extends Exception {
    public NegativeRadiusException(){
        super("Radius can't be negative");
    }
}
