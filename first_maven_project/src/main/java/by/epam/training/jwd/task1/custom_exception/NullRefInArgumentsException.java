package by.epam.training.jwd.task1.custom_exception;

public class NullRefInArgumentsException extends Exception {
    public NullRefInArgumentsException(){
        super("Null reference has been passed as an argument");
    }
}
