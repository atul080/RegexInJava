package com.patternmatching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class UserValidationTest {
    UserValidation uv=new UserValidation();
    /*
    * Test case to check VALID first name.
    * @calls checkFirstName method of UserValidation class
    * */
    @Test
    public void fitstName_ifProper_shouldReturnTrue() throws UserValidationException
    {
        boolean check=uv.checkFirstName("Rahul");
        Assertions.assertTrue(check);
    }
    /*
     * Test case to check INVALID first name.
     * @calls checkFirstName method of UserValidation class
     * */
    @Test
    public void fitstName_ifNotProper_shouldReturnFalse() throws UserValidationException
    {
        boolean check=uv.checkFirstName("rahul");
        Assertions.assertFalse(check);
    }
    /*
     * Test case to check VALID Last name.
     * @calls checkLastName method of UserValidation class
     * */
    @Test
    public void lastName_ifProper_shouldReturnTrue() throws UserValidationException
    {
        boolean check=uv.checkLastName("Kumar");
        Assertions.assertTrue(check);
    }
    /*
     * Test case to check VALID phone number.
     * @calls checkPhoneNumber method of UserValidation class
     * */
    @Test
    public void phoneNumber_ifProper_shouldReturnTrue() throws UserValidationException
    {
        boolean check=uv.checkPhoneNumber("91 1235845678");
        Assertions.assertTrue(check);
    }
    /*
     * Test case to check INVALID phone number.
     * @calls checkPhoneNumber method of UserValidation class
     * */
    @Test
    public void phoneNumber_ifNotProper_shouldReturnFalse() throws UserValidationException
    {
        boolean check=uv.checkPhoneNumber("911235845678");
        Assertions.assertFalse(check);
    }
    /*
     * Test case to check VALID email id.
     * @calls checkEmail method of UserValidation class
     * */
    @Test
    public void email_ifProper_shouldReturnTrue() throws UserValidationException
    {
        boolean check=uv.checkEmail("abc+100@gmail.com");
        Assertions.assertTrue(check);
    }
    /*
     * Test case to check INVALID email id.
     * @calls checkEmail method of UserValidation class
     * */
    @Test
    public void email_ifNotProper_shouldReturnFalse() throws UserValidationException
    {
        boolean check=uv.checkEmail("abc+100gmail.com");
        Assertions.assertFalse(check);
    }
    /*
     * Test case to check VALID password.
     * @calls checkPassword method of UserValidation class
     * */
    @Test
    public void password_ifProper_shouldReturnTrue() throws UserValidationException
    {
        boolean check=uv.checkPassword("Abc6@ghjkloui");
        Assertions.assertTrue(check);
    }
    /*
     * Test case to check INVALID password.
     * @calls checkPassword method of UserValidation class
     * */
    @Test
    public void password_ifNotProper_shouldReturnFalse() throws UserValidationException
    {
        boolean check=uv.checkPassword("abc@ghjkloui");
        Assertions.assertFalse(check);
    }
}
