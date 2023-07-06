package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    //UC1

    public class Regex {
        public static void main(String[] args) {
            Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the First Name");
            String FirstName = scanner.nextLine();

            Matcher matcher = pattern.matcher(FirstName);
            if (matcher.matches()) {
                System.out.println("First Name is Valid");
            } else {
                System.out.println("Invalid");
            }
        }


        //UC2


        public void validLastName() {
            Pattern pattern = Pattern.compile("[a-b]+[A-Z][0-9]\"");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Last Name");
            String FirstName = scanner.nextLine();

            Matcher matcher = pattern.matcher(FirstName);
            if (matcher.matches()) {
                System.out.println("Last Name is Valid");
            } else {
                System.out.println("Invalid");
            }
        }


        //UC3
        public void validkeyName() {
            Pattern pattern = Pattern.compile("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your Mail");
            String keyName = scanner.nextLine();

            Matcher matcher = pattern.matcher(keyName);
            if (matcher.matches()) {
                System.out.println("Mail is valid");
            } else {
                System.out.println("Mail is Not valid");
            }
        }

    }
    


