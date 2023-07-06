package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Name");
        String FirstName = scanner.nextLine();

        Matcher matcher = pattern.matcher(FirstName);
        if(matcher.matches()){
            System.out.println("First Name is Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
