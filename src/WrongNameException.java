public class WrongNameException extends RuntimeException{

    public WrongNameException(String message) {
        super(message);
    }

    public void checkSymbol (String name){
        if (!name.matches("[a-zA-z]+"))
            throw new WrongNameException ("Incorrect character");
    }
    public void checkLength (String name) {
        if (name.length() < 4)
            throw new WrongNameException ("Name is too short");
    }
}
