//Check if the Array is Sorted.

import java.util.Arrays;

public class IsSorted {
    public static boolean isSorted(int[] a,int n){
//       If size of array is zero or one, return true.
        if (n==0||n==1){
            return true;
        }

//      Check last two elements of array, if they are
//      sorted, perform a recursive call with n-1
//      else, return false.
        if (a[n-1]<a[n-2]){
            return false;
        }

//      If all the elements will be found sorted, n will
//      eventually fall to one, satisfying Step 1.
        return isSorted(a,n-1);
    }

    public static void main(String[] args) {
        int[] a={1,3,4,5,6,10,31};
        System.out.println("Array Is: "+ Arrays.toString(a));
        int n=a.length;
        System.out.println("Third Largest Element : "+isSorted(a,n));
    }
}
   /* Array Is: [1, 3, 4, 5, 6, 10, 31]
        Third Largest Element : true

   */