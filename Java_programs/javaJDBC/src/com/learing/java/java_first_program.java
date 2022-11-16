package com.learing.java;

import java.util.Scanner;

public class java_first_program {
        public static void main(String[] args) {
            System.out.println("Taking Input from the users :");
            Scanner sc = new Scanner(System.in);
            System.out.println("Yours Math's Number :");
            int M = sc.nextInt();
            System.out.println("Yours Physics's Number :");
            int P = sc.nextInt();
            System.out.println("Yours Chemistry's Number :");
            int C = sc.nextInt();
            System.out.println("Yours English's Number :");
            int E = sc.nextInt();
            System.out.println("Yours Hindi's Number :");
            int H = sc.nextInt();
            double marks = (M + P + C + E + H);
            System.out.println(marks);
            System.out.println("Enter your total marks");
            double total_marks = sc.nextInt();
            double percentage = (marks/total_marks)*100;
            System.out.println("your total Percentage is :" + percentage);



        }
}
