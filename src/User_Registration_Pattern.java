import java.util.Scanner;
import java.util.regex.*;
public class User_Registration_Pattern {

    public boolean validateFirstName(String FirstName) {
       boolean isValid = FirstName.matches("[A-Z][a-z]{3,10}");
        if(isValid)
        {
            System.out.println("First name is valid");
        }
        else
        {
            System.out.println("First name is not valid ");
        }
        return isValid;
    }

    public static void main(String [] args)
    {
        System.out.println("Welcome to the User Registration problem ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first name");
        String Name=sc.next();
        User_Registration_Pattern urp=new User_Registration_Pattern();
        urp.validateFirstName(Name);
    }
}
