<h1>Exercise 1</h1>

1.Write a Java program that takes two numbers as input and display the product of two numbers.<br />

```java
import java.util.Scanner;

public class ProductOfTwoNum {

    public static int ProductOfTwoNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        return a * b;

    }

}


```
>Output:<br/>
1.Write a Java program that takes two
numbers as input and display the product 
of two numbers.<br/>
        22<br/>
        66<br/>
        1452<br/>
    
2.Write a Java program to print the area and perimeter of a circle.<br />
```java
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

```
>Output:
2.Write a Java program to print the area and perimeter of a circle.<br/>
        Enter The Radius<br/>
        5<br/>
        Area Of Circle 78.53981633974483<br/>
        Enter The Radius<br/>
        5<br/>
        Parameter Of Circle 31.41592653589793<br/>
        Process finished with exit code 0<br/>

  
  
  
 
    
3.Write a Java program that reads a number in inches, converts it to meters.<br />
```java
import java.util.Scanner;

import static java.lang.Math.round;

public class InchesToMeters {
    public static double inchesToMeters(){
        Scanner sc = new Scanner(System.in);
        int length=sc.nextInt();

        return (length/39.37);
    }
}
 
```
>Output:<br/>
 3. Write a Java program that reads a number in inches, converts it to meters.<br/>
        55<br/>
        1.397002794005588<br/>


4.Take three numbers from the user and print the greatest number.<br />
```java
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
```
>Output:<br/>
   Take three numbers from the user and print the greatest number.<br/>
        Enter Three Numbers:<br/>
        22<br/>
        11<br/>
        55<br/>
        greatest number is :55


5.Write a Java program that takes a year from user and print whether that year is a leap year or not.<br />

```java

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
```
>Output:<br/>
    Write a Java program that takes a year from user and print whether that year is a leap year or not.<br/>
        2204<br/>
        2204 is a leap year<br/>


6.Write a Java program to swap two numbers.<br />
```java
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
```
>Output:<br/>
    Write a Java program to swap two numbers.<br/>
        Enter two Numbers:<br/>
        55<br/>
        569<br/>
        Number before Swap 55 569<br/>
        Number after Swap 569 55<br/>
        Enter two Numbers:<br/>
        54<br/>
        66<br/>
        Number before Swap 54 66<br/>
        Number after Swap 66 54<br/>
        Process finished with exit code 0



7.Write a Java program to grade students based on their marks.<br />

```java

import java.util.Scanner;

public class GradeOfStudent {

    public static void gradeOfStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Marks:");
        int grade = sc.nextInt();


        if (grade >= 90)
            System.out.println("You got 'S' Grade");
        else if (grade >= 80)
            System.out.println("You got 'A' Grade");
        else if (grade >= 70)
            System.out.println("You got 'B' Grade");
        else if (grade >= 60)
            System.out.println("You got 'C' Grade");
        else if (grade >= 50)
            System.out.println("You got 'D' Grade");
        else if (grade >= 40)
            System.out.println("You got 'E' Grade");
        else if (grade < 40) {
            System.out.println("You got 'Fail' Grade");
        }
    }
}
```

>Output:<br/>
   Write a Java program to grade students based on their marks.
        Enter The Marks:
        35
        You got 'Fail' Grade

Enter The Marks:
84
You got 'A' Grade

Process finished with exit code 0




