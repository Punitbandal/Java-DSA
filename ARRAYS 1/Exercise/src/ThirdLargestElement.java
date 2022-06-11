//Find the Third-Largest Element in an Array.
import java.util.Arrays;

public class ThirdLargestElement {
    public static int thirdLargestElement(int[] a){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        if (a.length<3){
            System.out.println("Invalid Array");
        }

        for (int j : a) {
            if (j > first)
                first = j;
        }
        for (int j : a) {
            if ((j > second) && (j < first)) {
                second = j;
            }

        }
        for (int j : a) {
            if ((j > third) && (j < second)) {
                third = j;
            }
        }
        return third;
    }

    public static void main(String[] args) {
        int[] a={1,3,4,5,6,10,31,2,12};
        System.out.println("Array Is: "+ Arrays.toString(a));

        System.out.println("Third Largest Element : "+thirdLargestElement(a));
    }
}
   /* Array Is: [1, 3, 4, 5, 6, 10, 31, 2, 12]
        Third Largest Element : 10

   */