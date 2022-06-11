package Class1;

import java.util.Arrays;

public class SecondLargest {

    public static void main(String[] args) {
        int[] a={1,3,4,5,6,78,76,5,32,31} ;
        System.out.println(Arrays.toString(a));

        System.out.println("Second Largest Number Of Array :  ."+a[secondLargest(a)]);
    }
    public static int secondLargest(int a[]){
        int largest=0;
        int secondLargest=-1;

        if (a.length==0) return -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>a[largest]){
                secondLargest=largest;
                largest=i;

            }
            else if (a[i]<a[largest]){
                if (secondLargest==-1||a[i]>a[secondLargest])
                    secondLargest=i;
            }
        }
        return secondLargest;
    }


}
