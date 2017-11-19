package lesson18.task1;

public class WrongLoginException extends Exception {
    WrongLoginException (){
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
