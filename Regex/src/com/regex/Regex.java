package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static Pattern p= Pattern.compile("([a-z]|[a-z+-.a-z0-9])+((@[^-]+[a-z+.a-z+.a-z])|(@[^-][a-z+.a-z]))");
    public static void main(String[] ar)
    {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the valid email id.");
            String input = sc.next();
            boolean check = p.matcher(input).matches();
            if (check)
                System.out.println("Email id is valid.");
            else
                System.out.println("Invalid Email.");
        }
    }
}
