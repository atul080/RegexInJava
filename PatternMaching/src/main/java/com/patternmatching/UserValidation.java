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
    public boolean checkFirstName(String firstName) {
        Pattern p= Pattern.compile("[A-Z]{1}[a-z]{2,}");
        boolean check = p.matcher(firstName).matches();
        return check;
    }
    /*
     * Method to validate Last name.
     * @condition- Name should contain min 1 Capital and 2 small alphabets
     * @param STRING
     * @return BOOLEAN
     * */
    public boolean checkLastName(String lastName) {
        Pattern p= Pattern.compile("[A-Z]{1}[a-z]{2,}");
        boolean check = p.matcher(lastName).matches();
        return check;
    }
    /*
     * Method to validate phone number.
     * @condition- Phone number should contain contry code followed by 10 dit number ex- 91 4535756789
     * @param STRING
     * @return BOOLEAN
     * */
    public boolean checkPhoneNumber(String phnNum) {
        Pattern p= Pattern.compile("^[0-9]{2}\\s[0-9]{10}$");
        boolean check = p.matcher(phnNum).matches();
        return check;
    }
    /*
     * Method to validate email id.
     * @condition- Email should contain '@' and follow all the given conditions in question
     * @param STRING
     * @return BOOLEAN
     * */
    public boolean checkEmail(String email) {
        Pattern p= Pattern.compile("([a-z]|[a-z+-.a-z0-9])+((@[^-]+[a-z+.a-z+.a-z])|(@[^-][a-z+.a-z]))");
        boolean check = p.matcher(email).matches();
        return check;
    }
    /*
     * Method to validate password
     * @condition-  password should be of min 8 char, should contain min 1 capital, 1 digit, 1 special symbol
     * @param STRING
     * @return BOOLEAN
     * */
    public boolean checkPassword(String pswd) {
        Pattern p= Pattern.compile("(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*[#$@!%&*?])[A-Za-z\\d#$@!%&*?]{8,}");
        boolean check = p.matcher(pswd).matches();
        return check;
    }
}
