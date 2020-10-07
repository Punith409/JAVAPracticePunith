package com.FirstProgram;

import java.util.Scanner;

public class LoginScreen_UsingSwitch {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        String UserName, Password;

        System.out.println("Enter your Username: ");
        UserName = input.nextLine();

        System.out.println("Enter your Password: ");
        Password = input.nextLine();


       if (UserName.equals("Punith") && (Password.equals("Test@123"))){
           System.out.println("Welcome to Home page: Login Passed");
       }
       else {
           System.out.println("Login Failed");
       }
    }
}
