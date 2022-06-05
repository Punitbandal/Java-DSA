import java.util.Scanner;

public class MultiplicationTable {
    public static void multiplicationTable(){
        System.out.println("Write a Java program that takes a number as \n" +
                "input and prints its multiplication table upto 10.");
        Scanner sc=new Scanner(System.in);
        System.out.println("Number to Print Table :");
        int num=sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num+" X "+i+" = "+num*i);
        }

    }
}
//        Write a Java program that takes a number as
//        input and prints its multiplication table upto 10.
//        Number to Print Table :
//        5
//        5 X 1 = 5
//        5 X 2 = 10
//        5 X 3 = 15
//        5 X 4 = 20
//        5 X 5 = 25
//        5 X 6 = 30
//        5 X 7 = 35
//        5 X 8 = 40
//        5 X 9 = 45
//        5 X 10 = 50
//
//        Process finished with exit code 0
