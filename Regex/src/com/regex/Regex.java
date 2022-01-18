package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static Pattern p= Pattern.compile("(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*[#$@!%&*?])[A-Za-z\\d#$@!%&*?]{8,}");
    public static void main(String[] ar)
    {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the valid password.");
            String input = sc.next();
            boolean check = p.matcher(input).matches();
            if (check)
                System.out.println("Password is valid.");
            else
                System.out.println("Invalid Password.");
        }
    }
}
