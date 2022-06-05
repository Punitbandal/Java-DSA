<h1>Exercise 2</h1>


1. Write a Java program to find the numbers greater than the average of the numbers of a given array.<br/>
```java
import java.util.*;
public class GraterThanAverageInArray {

    public static void GraterThanAverageInArray(){
        System.out.println("Write a Java program to find the numbers greater than \nthe average of the numbers of a given array.");
        Scanner sc=new Scanner(System.in);

        int[] a={10,33,44,33,22,33};
        int sum=0;
        System.out.println("Orignal Array: ");
        System.out.println(Arrays.toString(a));

        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("Sum of arrays: "+ sum);
        double avg=sum/a.length;
        System.out.println("Average of Arrays:"+ avg);
        System.out.println("numbers greater than the average of the numbers of a given array:");
        for (int i=0;i<a.length;i++)
        {
            if(a[i]>avg)
                System.out.println(a[i]);
        }

    }
}
```
>Output:
   Write a Java program to find the numbers greater than<br/>
    the average of the numbers of a given array.<br/>
        Orignal Array:<br/>
        [10, 33, 44, 33, 22, 33]<br/>
        Sum of arrays: 175<br/>
        Average of Arrays:29.0<br/>
        numbers greater than the average of the numbers of a given array:<br/>
        33<br/>
        44<br/>
        33<br/>
        33<br/>
        Process finished with exit code 0<br/>
<br/>
2.Write a Java program that takes a number as input and prints its multiplication table upto 10.<br/>

```java
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
```
>Output:
Write a Java program that takes a number as<br/>
       input and prints its multiplication table upto 10.<br/>
        Number to Print Table :<br/>
        5<br/>
        5 X 1 = 5<br/>
        5 X 2 = 10<br/>
        5 X 3 = 15<br/>
        5 X 4 = 20<br/>
        5 X 5 = 25<br/>
        5 X 6 = 30<br/>
        5 X 7 = 35<br/>
        5 X 8 = 40<br/>
        5 X 9 = 45<br/>
        5 X 10 = 50<br/>
        Process finished with exit code 0<br/>



3.Write a Java program to sum values of an array.<br/>
```java
import java.util.Arrays;
import java.util.Scanner;

public class SumOfArrays {
    public static void sumOfArrays(){
        System.out.println("Write a Java program to sum values of an array.\n");
        Scanner sc=new Scanner(System.in);

        int[] a={10,33,44,33,22,33};
        int sum=0;
        System.out.println("Orignal Array: ");
        System.out.println(Arrays.toString(a));

        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("Sum of arrays: "+ sum);
    }
}
```
>Output:<br/>
Write a Java program to sum values of an array.<br/>
        Orignal Array:<br/>
        [10, 33, 44, 33, 22, 33]<br/>
        Sum of arrays: 175<br/>


4.Write a Java program to find the maximum and minimum value of an array.<br/>
```java
import java.util.Arrays;
import java.util.Scanner;

public class MinMaxInArray {

    public static void MinMaxInArray(){
        System.out.println("Write a Java program to find the maximum and minimum value of an array.\n");
        Scanner sc=new Scanner(System.in);

        int[] a={11,33,44,54,21,55,12,4};
        System.out.println("Orignal Array: ");
        System.out.println(Arrays.toString(a));

        int min=2147483647;
        int max=-2147483648;

        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min)
                min=a[i];
        }

        System.out.println("maximum value of an array:"+max);
        System.out.println("minimum value of an array:"+min);
    }

}
```
>Output:<br/>
Write a Java program to find the maximum and minimum value of an array.<br/>
        Orignal Array:<br/>
        [11, 33, 44, 54, 21, 55, 12, 4]<br/>
        maximum value of an array:55<br/>
        minimum value of an array:4<br/>


5.Write a Java program to separate Os on left side and 1s on right side of an array of Os and 1s in
random order.<br/>
```java
import java.util.Arrays;

public class Separate0sAnd1s {
    public static void separate0sAnd1s(){

        int[] a=new int[] {1,0,1,1,0,0,1,0,1,1,1,0};
        System.out.println("Orignal Array: ");
        System.out.println(Arrays.toString(a));

        int count=0;
        int size=a.length;

        for (int i = 0; i < size; i++) {
            if(a[i]==0)
                count++;
        }
        for (int i = 0; i < count; i++) {
            a[i]=0;
        }
        for (int i = count; i < size; i++) {
            a[i]=1;
        }
        System.out.println("Segregate 0s on Left Side & 1s on Right Side of the Array : ");
        System.out.println(Arrays.toString(a));



    }
}
```
>Output:<br/>
Orignal Array:<br/>
        [1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0]<br/>
        Segregate 0s on Left Side & 1s on Right Side of the Array :<br/>
        [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1]<br/>
        Process finished with exit code 0<br/>
        
        
6.Write a Java method to find the smallest number among three numbers.<br/>
```java
public class SmallestNum {
    public static void main(String[] args) {

        System.out.println("smallest number among three numbers(MethodCall):"+smallestNum(22,52,32));
    }
    public static int smallestNum(int a,int b,int c){
        System.out.println("Write a Java method to find the smallest number among three numbers.\n"
        +"Numbers are :"+a+" "+b+" "+c);
    if ((a<b)&&(a<c))
        return a;
    else if((b<a)&&b<c)
        return b;
    else
        return c;

    }
}
```
>Output:<br/>
 Write a Java method to find the smallest number among three numbers.<br/>
        Numbers are :22 52 32<br/>
        smallest number among three numbers(MethodCall):22<br/>
        Process finished with exit code 0<br/>
        
        
7.Write a Java method to print Fibonacci series of n terms where n is argument passed by user.<br/>
```java
public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacciSeries(10);
    }
    public static void  fibonacciSeries(int n){
        System.out.println("Write a Java method to print Fibonacci series of n terms where n is argument passed by user.");
        int a=0,b=1,c;
        System.out.println("Fibonacci series of "+n +" terms.");
        System.out.print(a+" "+b);
        for (int i = 2; i < n; i++) {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }

    }
}
```
   >Output:<br/>
   Write a Java method to print Fibonacci series of n terms where n is argument passed by user.<br/>
        Fibonacci series of 10 terms.<br/>
        0 1 1 2 3 5 8 13 21 34<br/>
        Process finished with exit code 0<br/>

8.Write a program to find the factorial value of any number entered through the keyboard.<br/>
```java

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
```
>Output:<br/>
    Write a program to find the factorial value of any number entered through the keyboard.<br/>
        Enter the number:<br/>
        5<br/>
        Factorial of the number: 120<br/>
**Main file**
```java
public class Main {
    public static void main(String[] args) {

        GraterThanAverageInArray.GraterThanAverageInArray();
        MultiplicationTable.multiplicationTable();
        SumOfArrays.sumOfArrays();
        MinMaxInArray.MinMaxInArray();
        Separate0sAnd1s.separate0sAnd1s();
        Factorial.factorial();
    }
}
```
        
        
