import java.util.Scanner;

import static java.lang.Math.round;

public class InchesToMeters {
    public static double inchesToMeters(){
        Scanner sc = new Scanner(System.in);
        int length=sc.nextInt();

        return (length/39.37);
    }
}
  /* 3. Write a Java program that reads a number in inches, converts it to meters.

        55
        1.397002794005588
*/