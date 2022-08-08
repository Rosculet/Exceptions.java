public class NullFieldException extends RuntimeException{


    public NullFieldException() {
        super("You have not entered all data in fields ");
    }

    public void check (String name){
        if (name == null)
            throw new NullFieldException();
        }
    }

