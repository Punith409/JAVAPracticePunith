package com.FirstProgram;

import java.util.Scanner;

public class Calculator_UsingSwitch {

    public static void main (String[] args){

        int a, b, c, choice;
        System.out.println("Enter two inputs");

        Scanner input1 = new Scanner(System.in);
        a = input1.nextInt();
        b = input1.nextInt();

        System.out.println("Enter your Calculation method\n 1.addition\n 2.subtraction \n 3.multiplication \n 4.division");

        choice = input1.nextInt();

        switch (choice){
            case 1 : c = a + b;
            System.out.println("The addition of two inputs is:" + c);
            break;
            case 2 : c = a - b;
            System.out.println("The subtraction of two inputs is: " + c);
            break;
            case 3 : c = a * b;
            System.out.println("The multiplication of two inputs is:" + c);
            break;
            case 4 : c = a / b;
            System.out.println("The division " + c);
            break;
            default: System.out.println("nothing matched");
        }




    }
}
