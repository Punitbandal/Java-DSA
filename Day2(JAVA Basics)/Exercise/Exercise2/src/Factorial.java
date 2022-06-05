import java.util.Scanner;

public class Factorial {
    public static void factorial(){
        System.out.println("Write a program to find the factorial value of any number entered through the keyboard.");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();

        int fact=1;
        for (int i = 1; i <= num; i++) {
            fact*=i;
        }
        System.out.println("Factorial of the number: "+fact);


    }
}
  /*  Write a program to find the factorial value of any number entered through the keyboard.
        Enter the number:
        5
        Factorial of the number: 120*/