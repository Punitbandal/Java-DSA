import java.util.Scanner;

public class SwapNumbers {
    public static void swapNumbers(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Number before Swap "+a+" "+b);

        int temp=a;
        a=b;
        b=temp;

        System.out.println("Number after Swap "+a+" "+b);
    }

    public static void swapNumbersWithoutTemp(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Number before Swap "+a+" "+b);

     a=a+b;
     b=a-b;
     a=a-b;

        System.out.println("Number after Swap "+a+" "+b);
    }
}
/*
    Write a Java program to swap two numbers.

        Enter two Numbers:
        55
        569
        Number before Swap 55 569
        Number after Swap 569 55
        Enter two Numbers:
        54
        66
        Number before Swap 54 66
        Number after Swap 66 54

        Process finished with exit code 0
*/
