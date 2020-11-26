package by.epam.training.jwd.task1.custom_exception;

public class IllegalDatePartException extends Exception {
    public IllegalDatePartException(){
        super("One of the following issues was found:\n" +
                "day in month's number out of [1, 31]\n" +
                "mouth's number out of [1, 12]\n" +
                "year's number is negative\n");
    }
}
