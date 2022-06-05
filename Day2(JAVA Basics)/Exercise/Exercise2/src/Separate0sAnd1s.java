import java.util.Arrays;

public class Separate0sAnd1s {
    public static void separate0sAnd1s(){

        int[] a=new int[] {1,0,1,1,0,0,1,0,1,1,1,0};
        System.out.println("Orignal Array: ");
        System.out.println(Arrays.toString(a));

        int count=0;
        int size=a.length;

        for (int i = 0; i < size; i++) {
            if(a[i]==0)
                count++;
        }
        for (int i = 0; i < count; i++) {
            a[i]=0;
        }
        for (int i = count; i < size; i++) {
            a[i]=1;
        }
        System.out.println("Segregate 0s on Left Side & 1s on Right Side of the Array : ");
        System.out.println(Arrays.toString(a));



    }
}
   /* Orignal Array:
        [1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0]
        Segregate 0s on Left Side & 1s on Right Side of the Array :
        [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1]

        Process finished with exit code 0*/