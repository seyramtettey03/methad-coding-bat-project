package com.LickinHeights;

public class Main {

    public static void main(String[] args) {
       System.out.println("hello world");
       System.out.println("Hello star");
       System.out.println("hello university");
       System.out.println("moon");

        int a = 7;
        int b = 9;
        System.out.println(a = b);
        int c = add(a,b);
        int d = add(c,a);
        System.out.println(d);

    }
        public static void printGreeding(String noun){

        System.out.println("hello " +noun) ;
        }

        public static int add(int firstnumber, int secondnumber ){

        return firstnumber + secondnumber;
        }
        public static void makenumber600(int number) {
            System.out.println("before number changes:   " + number);
            number = 600;
            System.out.println("after number changes: +number");
            return;


    }

}
