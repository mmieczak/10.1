public class IncorrectAgeException extends Exception{

    public IncorrectAgeException() {
        super("Age cannot be less then 1");
    }

}
