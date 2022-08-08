public class WrongYearException extends RuntimeException{
    public WrongYearException() {
        super("You entered incorrect birth data !");
    }

    public void check(int age){
        if (age < 1900 || age > 2022)
            throw new WrongYearException();
    }
}
