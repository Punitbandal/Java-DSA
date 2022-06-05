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
//    Write a Java program to sum values of an array.
//
//        Orignal Array:
//        [10, 33, 44, 33, 22, 33]
//        Sum of arrays: 175