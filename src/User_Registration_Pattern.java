import java.util.Scanner;
import java.util.regex.*;

/**
 * User_Registration_Pattern class is checking a validation for user registration
 */
public class User_Registration_Pattern {

    public static void main(String[] args) {
        System.out.println("Welcome to the User Registration problem ");
        Scanner sc = new Scanner(System.in);
        //
        User_Registration_Pattern urp = new User_Registration_Pattern();
        System.out.println("Enter a first name");
        String Name = sc.next();
        urp.validateFirstName(Name);
        System.out.println("Enter a last name");
        String lastName = sc.next();
        urp.validateLastName(lastName);
        System.out.println("Enter a email Id");
        String email = sc.next();
        urp.validateEmailid(email);
        System.out.println("Enter a mobile number");
        String mobileNo = sc.next();
        urp.validateMobileno(mobileNo);
        System.out.println("Enter a valid password");
        String validatepassword = sc.next();
        urp.validatePassword(validatepassword);

    }

    /*
    *validateFirstName method is validating the first name
    * @param FirstName is a first name passed to the validateFirstName function to check validation
    * @return isvalid is will true or false if conditions are true or false
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
         * validateLastName method is validating the last name
         * @param lastName  is a last name passed to the validateLastName function to check validation
         * @return isValidLastName is will true or false if conditions are true or false
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
    /*
         * validateEmailid method is validating the last name
         * @param email  is a email id to validateEmail function
         * @return isValidEmail will true or false if conditions are true or false
        */
    public boolean validateEmailid(String EmailId) {
        boolean isValidEmail = EmailId.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$");
        if (isValidEmail) {
            System.out.println("Email name is valid");
        }
        else
        {
            System.out.println("Email name is not valid ");
        }
        return isValidEmail;
    }
    /*
        * validateMobileno method is validating the mobile number
        * @param mobNo is a parameter for  validateMobileno  to check validation for mobile number
        * @return isValidMobileNumber will true or false if condition are true or false
       */
    public boolean validateMobileno(String mobNo) {
        boolean isValidMobileNumber = mobNo.matches("^(\\+91[ ])?\\d{10}$");
        if (isValidMobileNumber) {
            System.out.println("mobile number is valid");
        }
        else
        {
            System.out.println("mobile number is not valid ");
        }
        return isValidMobileNumber;
    }
    /*
       * validatePassword method is validating the password should have minimum 8 characters and one Upper case one number one special character
       * @param password is a parameter for the validatePassword to check validation for password
       * @return validatePassword will true or false if condition are true or false
       */
    public boolean validatePassword(String password) {
        boolean isValidPassword = password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
        if (isValidPassword) {
            System.out.println("password is valid");
        }
        else
        {
            System.out.println("Password has not minimum 8 characters and one upper case character and one number");
        }
        return isValidPassword;
    }
}
