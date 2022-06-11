package Class1;

import java.util.Arrays;

public class DeleteAnElementInArray {
    public static void main(String[] args) {
        int[] a={1,3,4,15,6,78,76,5,32,31} ;

        int key =1;

        System.out.println(Arrays.toString(a));
        delete(a,key);
        System.out.println(Arrays.toString(a)) ;
        delete(a,4);
        System.out.println(Arrays.toString(a)) ;
    }
    public static int[] delete(int a[],int key){
        int n=a.length;
        int pos=SearchInArray.SearchInArray(a,key);
        if (pos==-1)
            return a;

        for (int i=pos;i< a.length-1;i++){
            a[i]=a[i+1];
        }
        a[n-1]=0;

        return a;
    }

}
