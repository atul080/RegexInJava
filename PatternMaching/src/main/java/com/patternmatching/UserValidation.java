/*
* @Author- Atul Srivastav
* @date 16/01/22
* User data validation program
* */
package com.patternmatching;

import java.util.regex.Pattern;

public class UserValidation {
    /*
    * Method to validate first name.
    * @condition- Name should contain min 1 Capital and 2 small alphabets
    * @param STRING
    * @return BOOLEAN
    * */
    public boolean checkFirstName(String firstName) throws UserValidationException{

        Pattern p= Pattern.compile("[A-Z]{1}[a-z]{2,}");
        boolean check = p.matcher(firstName).matches();
        if(check)
            return check;
        else
            throw new UserValidationException("Invalid First Name.");
    }
    /*
     * Method to validate Last name.
     * @condition- Name should contain min 1 Capital and 2 small alphabets
     * @param STRING
     * @return BOOLEAN
     * */
    public boolean checkLastName(String lastName) throws UserValidationException{
        Pattern p= Pattern.compile("[A-Z]{1}[a-z]{2,}");
        boolean check = p.matcher(lastName).matches();
        if(check)
            return check;
        else
            throw new UserValidationException("Invalid Last Name.");
    }
    /*
     * Method to validate phone number.
     * @condition- Phone number should contain contry code followed by 10 dit number ex- 91 4535756789
     * @param STRING
     * @return BOOLEAN
     * */
    public boolean checkPhoneNumber(String phnNum) throws UserValidationException{
        Pattern p= Pattern.compile("^[0-9]{2}\\s[0-9]{10}$");
        boolean check = p.matcher(phnNum).matches();
        if(check)
            return check;
        else
            throw new UserValidationException("Invalid Phone Number.");
    }
    /*
     * Method to validate email id.
     * @condition- Email should contain '@' and follow all the given conditions in question
     * @param STRING
     * @return BOOLEAN
     * */
    public boolean checkEmail(String email) throws UserValidationException{
        Pattern p= Pattern.compile("([a-z]|[a-z+-.a-z0-9])+((@[^-]+[a-z+.a-z+.a-z])|(@[^-][a-z+.a-z]))");
        boolean check = p.matcher(email).matches();
        if(check)
            return check;
        else
            throw new UserValidationException("Invalid Email id.");
    }
    /*
     * Method to validate password
     * @condition-  password should be of min 8 char, should contain min 1 capital, 1 digit, 1 special symbol
     * @param STRING
     * @return BOOLEAN
     * */
    public boolean checkPassword(String pswd) throws UserValidationException{
        Pattern p= Pattern.compile("(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*[#$@!%&*?])[A-Za-z\\d#$@!%&*?]{8,}");
        boolean check = p.matcher(pswd).matches();
        if(check)
            return check;
        else
            throw new UserValidationException("Invalid Password.");
    }
}
