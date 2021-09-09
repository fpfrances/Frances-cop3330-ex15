/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Filipe Frances
 */
import java.util.Scanner;
public class PassValidation {
    public static void main(String args[]){
        String knownPassword  = "abc$123";
        System.out.print("Enter your Username: ");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        System.out.print("What is the password? ");
        String password = sc.nextLine();
        if(knownPassword.equals(password)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }
}
