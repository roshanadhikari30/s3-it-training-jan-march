package jan09;

import java.util.Scanner;

public class IfElse {

    public static void main(String args[]) {

        int year;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = scr.nextInt();

        if (year % 4 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + "is a leap year");
            } else if (year % 100 == 0) {
                System.out.println(year + "is not a leap year");
            } else {
                System.out.println(year + "is not a leap year");
            }
        }
    }
}



