public class User {
    private String firstname;
    private String lastname;
    private int age;
    private String email;

    private User(String firstname, String lastname, int age, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
    }


    public static User create (String firstname, String lastname, int age, String email) {

        int count = 0;

        try {
            new WrongNameException(firstname).checkSymbol(firstname);
        } catch (WrongNameException  e) {
            count++;
            System.err.println("Incorrect character in 'Last name' !");
        }

        try {
            new WrongNameException(firstname).checkLength(firstname);
        } catch (WrongNameException  e) {
            count++;
            System.err.println("Too short 'Last name' !");
        }

        try {
            new WrongNameException(firstname).checkSymbol(lastname);
        } catch (WrongNameException  e) {
            count++;
            System.err.println("Incorrect character in 'First name' !");
        }

        try {
            new WrongYearException().check(age);
        } catch (WrongYearException e) {
            count++;
            System.err.println(e.getMessage());
        }

        try {
            new WrongMailException(email).checkSymbol(email);
        } catch (WrongMailException e) {
            count++;
            System.err.println(e.getMessage());
        }

        try {
            new WrongMailException(email).checkLength(email);
        } catch (WrongMailException e) {
            count++;
            System.err.println(e.getMessage());
        }
        

        if (count > 0) {
            System.out.print("This User was not created, you may fix " + count + " input errors: ");
            System.out.println(new User(firstname, lastname, age, email));
            return null;
        }  else  {
            System.out.print("This user successful created: ");
            System.out.println(new User(firstname, lastname, age, email));
            return new User(firstname, lastname, age, email);}
    }
    @Override
    public String toString() {
        return firstname + " " + lastname + " "+  age + " " +  email;
    }
}
