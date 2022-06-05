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
  /*  Write a Java program to find the numbers greater than
    the average of the numbers of a given array.
        Orignal Array:
        [10, 33, 44, 33, 22, 33]
        Sum of arrays: 175
        Average of Arrays:29.0
        numbers greater than the average of the numbers of a given array:
        33
        44
        33
        33

        Process finished with exit code 0*/
