package Exceptions;

public class FileDoesntExistException extends Exception{

    private String message = "Error: File with such name does not exist";

    @Override
    public String getMessage() {
        return message;
    }

}
