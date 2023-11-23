import java.util.Scanner;
import java.util.regex.*;

/**
 * User_Registration_Pattern class is checking a validation for user registration
 *
 * @param FirstName is a first name passed to the validateFirstName function to check validation
 * @param lastName  is a last name passed to the validateLastName function to check validation
 * @return isvalid is will true or false if conditions are true or false
 */
public class User_Registration_Pattern {

    public static void main(String[] args) {
        System.out.println("Welcome to the User Registration problem ");
        Scanner sc = new Scanner(System.in);
        //
        System.out.println("Enter a first name");
        String Name = sc.next();
        System.out.println("Enter a last name");
        String lastName = sc.next();
        User_Registration_Pattern urp = new User_Registration_Pattern();
        urp.validateFirstName(Name);
        urp.validateLastName(lastName);
    }

    /*
    validateFirstName method is validating the first name
    */
    public boolean validateFirstName(String FirstName) {
        boolean isValid = FirstName.matches("[A-Z][a-z]{3,10}");
        if (isValid) {
            System.out.println("First name is valid");
        } else {
            System.out.println("First name is not valid ");
        }
        return isValid;
    }

    /*
        validateLastName method is validating the last name
        */
    public boolean validateLastName(String lastName) {
        boolean isValidLastName = lastName.matches("[A-Z][a-z]{3,10}");
        if (isValidLastName) {
            System.out.println("Last name is valid");
        } else {
            System.out.println("Last name is not valid ");
        }
        return isValidLastName;
    }
}
