package Exceptions;

import java.lang.Exception;

public class NoSubClassFoundError extends Exception {

    public NoSubClassFoundError(String Message) {
        super(Message);
    }
}
