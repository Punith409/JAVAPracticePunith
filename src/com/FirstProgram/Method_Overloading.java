package com.FirstProgram;

public class Method_Overloading {

    public static void main (String[] args){

        System.out.println("Method invoked is");
        main(10 , 2);

    }

    public static void main (int a){
        System.out.println(a);
    }

    public static void main (int a, int b){
        System.out.println(a + b);
    }



}
