package pl._1024kb.stowarzyszenienaukijavy.simpletodo.model.exception;

public class UsernameIsAlreadyExistException extends Exception
{
    public UsernameIsAlreadyExistException() {
    }

    public UsernameIsAlreadyExistException(String message) {
        super(message);
    }
}
