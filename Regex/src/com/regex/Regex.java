package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static Pattern p= Pattern.compile("([a-z]|[a-z+-.a-z0-9])+((@[^-]+[a-z+.a-z+.a-z])|(@[^-][a-z+.a-z]))");
    public static void main(String[] ar)
    {
        String[] emails={"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"};
            for(String id:emails)
            {
                boolean check = p.matcher(id).matches();
             if (check)
                System.out.println(id+" Email id is valid.");
             else
                System.out.println(id+" Invalid Email.");
        }
    }
}
