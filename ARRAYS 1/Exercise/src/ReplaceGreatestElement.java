//Write a program to replace every element with the greatest element on its right side.
//Expected Output:
//The given array is : 75 8 9 6 8 5 7 4 6
//After replace the modified array is: 9 9 9 8 8 7 7 6 6 0

import java.util.Arrays;

public class ReplaceGreatestElement {

    public static int[] replaceGreatestElement(int[] a,int n){

        for (int i = 0; i < n; i++) {
            int max=0;
            for (int j = i+1; j < n; j++) {
                if(a[j]>max)
                {
                    max=a[j];
               }
            }
            a[i]=max;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a={7,5,8,9,6,8,5,7,4,6};
        System.out.println("Array Is: "+ Arrays.toString(a));
        int n=a.length;
        System.out.println("After replace the modified array is: "+Arrays.toString(replaceGreatestElement(a,n)));
    }

}

  /*  Array Is: [7, 5, 8, 9, 6, 8, 5, 7, 4, 6]
        After replace the modified array is: [9, 9, 9, 8, 8, 7, 7, 6, 6, 0]

  */

