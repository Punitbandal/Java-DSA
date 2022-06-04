import java.util.Scanner;

public class LeapYear {

    public static void leapYear() {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else
            System.out.println(year + " is Not a leap year");
    }
}

/*
    Write a Java program that takes a year from user and print whether that year is a leap year or not.
        2204
        2204 is a leap year*/
