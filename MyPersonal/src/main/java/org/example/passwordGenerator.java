package org.example;

import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;

public class passwordGenerator {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        System.out.println("Do you want to generate a password? ");
        String choice = readInput.next();
        choice = choice.toUpperCase();

        if (choice.equals("YES")) {
            String password = generator();
            System.out.println("Generated Password: " + password);
        }
        else{
            System.out.println("Entered choice is incorrect!");
        }
    }
    public static String generator() {
        String password = RandomStringUtils.randomAscii(12);
        return password;
    }
}