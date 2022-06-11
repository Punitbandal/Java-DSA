//Reverse the given Array.

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverseArray(int[] a){
        int n=a.length;

        for (int i = 0; i < n; i++) {
            int temp=a[n-1];
            a[n-1]=a[i];
            a[i]=temp;
            n--;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a={1,3,4,5,6,10,31};
        System.out.println("Array Is: "+ Arrays.toString(a));
        int n=a.length;
        System.out.println(" Reversed Array: "+Arrays.toString(reverseArray(a)));
    }
}
/*
    Array Is: [1, 3, 4, 5, 6, 10, 31]
        Reversed Array: [31, 10, 6, 5, 4, 3, 1]
        */
