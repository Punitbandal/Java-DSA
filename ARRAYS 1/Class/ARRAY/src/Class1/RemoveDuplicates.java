package Class1;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] a={2,2,3,4,4,5,5,6,6,7,7,7,7} ;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(RemoveDuplicates(a)));
    }
    public static int[] RemoveDuplicates(int a[]){
           int n=a.length;
           int j=0;
        for (int i = 0; i < n; i++) {
            if (a[i]!=a[j]){
                a[j+1]=a[i];
                j++;
            }
        }
        return a;
    }

}
