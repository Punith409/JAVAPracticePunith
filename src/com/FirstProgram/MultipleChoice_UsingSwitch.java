package com.FirstProgram;

import java.util.Scanner;

public class MultipleChoice_UsingSwitch {

    public static void main (String[] args){
        int choice;

        System.out.println("Who is going to win IPL2020?");
        Scanner input = new Scanner(System.in);

        System.out.println("\n 1.MI\n 2.CSK \n 3.RR \n 4.RCB");
        choice = input.nextInt();

        switch (choice){
            case 1 : System.out.println("MI");
            break;
            case 2 : System.out.println("CSK");
            break;
            case 3 : System.out.println("RR");
            break;
            case 4 : System.out.println("RCB");
            break;
            default: System.out.println("IPL stopped due to corona");
        }

    }
}
