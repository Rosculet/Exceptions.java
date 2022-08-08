public class WrongMailException extends RuntimeException{
    public WrongMailException(String message) {
        super(message);
    }

    public void checkSymbol (String email) {
        if (!email.contains("@") || !email.contains("."))
            throw new WrongMailException("You entered incorrect email !");
    }
    public void checkLength (String email) {
        if (email.length()<4)
            throw new WrongMailException("Mail length is too short ");
    }
}
