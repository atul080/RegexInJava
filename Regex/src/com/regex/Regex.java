package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static Pattern p= Pattern.compile("^[0-9]{2}\\s[0-9]{10}$");
    public static void main(String[] ar)
    {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the valid phone number.");
            String input = sc.nextLine();
            boolean check = p.matcher(input).matches();
            if (check)
                System.out.println("Phone Number is valid.");
            else
                System.out.println("Invalid Phone Number.");
        }
    }
}
