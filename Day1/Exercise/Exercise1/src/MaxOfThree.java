import java.util.Scanner;

public class MaxOfThree {

    public static int maxOfThree(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=sc.nextInt();
        if ((a > b)&&(a>c)) {
            return a;
        }
        else if ((b>a)&&(b>c))
            return b;
        else
            return c;
    }
}
   /* Take three numbers from the user and print the greatest number.

        Enter Three Numbers:
        22
        11
        55
        greatest number is :55*/