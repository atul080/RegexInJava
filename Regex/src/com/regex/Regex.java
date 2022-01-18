package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static Pattern p= Pattern.compile("[A-Z]{1}[a-z]{2,}");
    public static void main(String[] ar)
    {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the valid first name.");
            String input = sc.next();
            boolean check = p.matcher(input).matches();
            if (check)
                System.out.println("First Name is valid.");
            else
                System.out.println("Invalid First Name");
        }
    }
}
