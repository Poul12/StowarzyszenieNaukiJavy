package pl._1024kb.stowarzyszenienaukijavy.simpletodo.model.exception;

public class NotTheSamePasswordException extends Exception
{
    public NotTheSamePasswordException() {
    }

    public NotTheSamePasswordException(String message) {
        super(message);
    }
}
