package ru.houm.level_one.lesson_one;
import java.util.Scanner;

public class FirstClass {

    static void calculations(int a, int b, int c, int d) {
        System.out.println(a*(b+(c/d)));
    }

    static void checking_numbers(int a) {
        boolean bool = a < 0;
        System.out.println(bool);
    }

    static  void checking_numbers_2(int a, int b) {
        int sum_ab = (a + b);
        boolean bool;
        bool = sum_ab >= 10 && sum_ab <= 20;
        System.out.println(bool);
    }

    static void leap_year() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите год: ");
        int year = in.nextInt();
        in.close();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Поздравляю!!! Этот год высокосный!!!");
        } else {
            System.out.println("Этот год не высокосный");
        }
    }

    public static void main(String[] args) {
        System.out.println("HelloWorld");

        calculations(2, 4, 3, 5);
        leap_year();
        checking_numbers(-12);
        checking_numbers_2(18, 1);

    }
}
