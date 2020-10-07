package com.FirstProgram;

public class Largest_Number_Among3 {

    public static void main(String[] args) {

        Largest_Number_Among3.LargestNumb(8, 456, 878);
    }

    public static void LargestNumb(int num1, int num2, int num3) {


        if (num1 >= num2) {
            if (num1 >= num3) {
                System.out.println(num1 + "is the largest number");
            } else {
                System.out.println(num3 + "is the largest number");
            }
        } else {
            if (num2 >= num3) {
                System.out.println(num2 + "is the largest number");
            } else {
                System.out.println(num3 + "is the largest number");
            }

        }
    }
}




