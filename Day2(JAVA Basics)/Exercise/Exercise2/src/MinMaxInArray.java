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
 /*   Write a Java program to find the maximum and minimum value of an array.

        Orignal Array:
        [11, 33, 44, 54, 21, 55, 12, 4]
        maximum value of an array:55
        minimum value of an array:4
*/