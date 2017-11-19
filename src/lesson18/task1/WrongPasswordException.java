package lesson18.task1;

public class WrongPasswordException extends Exception{
    WrongPasswordException (){
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}