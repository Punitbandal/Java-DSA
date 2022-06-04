import java.util.Scanner;

public class AreaCircle {

    public static double area(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius");
        int r = sc.nextInt();


        return r*r*Math.PI;

    }
    public static double parameter(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius");
        int r = sc.nextInt();


        return r*2*Math.PI;

    }
}
/*
2.Write a Java program to print the area and perimeter of a circle.
        Enter The Radius
        5
        Area Of Circle 78.53981633974483
        Enter The Radius
        5
        Parameter Of Circle 31.41592653589793

        Process finished with exit code 0
*/
