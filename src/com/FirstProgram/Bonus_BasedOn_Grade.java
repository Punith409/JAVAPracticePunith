package com.FirstProgram;

import java.util.Scanner;

public class Bonus_BasedOn_Grade {

    public static void main (String[] args){

        int  bonus;
        char grade = 'C';
        //char grade2 = 'B';
        //char grade3 = 'C';

        System.out.println("Bonus for an employee");
        Scanner input = new Scanner(System.in);

        //System.out.println("\n A.5000\n B.3500 \n C.2000 ");
        bonus = input.nextInt();

        System.out.println("Enter the grade of employee");
        grade=input.next().charAt(0);

        switch (grade){
            case 'A' : System.out.println("5000");
                break;
            case 2 : System.out.println("3500");
                break;
            case 3 : System.out.println("2000");
                break;
            default: System.out.println("IPL stopped due to corona");
        }
    }
}
