//Find the smallest element in the given Array.
import java.util.Arrays;

public class SmallestElement {
    public static int smallestElement(int[] a){

    int min=Integer.MAX_VALUE;

        for (int j : a) {
            if (j < min) {
                min = j;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] a={1,3,4,5,6,10,31,2,12};

        System.out.println("Array Is: "+Arrays.toString(a));
        System.out.println("Smallest Element in Given Array is: "+smallestElement(a));
    }
}
   /* Array Is: [1, 3, 4, 5, 6, 10, 31, 2, 12]
        Smallest Element in Given Array is: 1
   */