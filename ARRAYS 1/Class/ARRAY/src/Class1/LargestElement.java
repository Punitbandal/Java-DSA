package Class1;
class Pair{
    public int a,b;
    Pair(int a,int b){
        this.a=a;
        this.b=b;
    }
}

public class LargestElement {
    public static void main(String[] args) {

        int a[]={27,3,6,7,8,9,4,33,44,446,35,67};
           Pair aaa=maxOf(a);
        System.out.println("Largest Number Is : " +aaa.a);
        System.out.println("Index Of Largest Number Is : "+aaa.b);

    }
    public static Pair maxOf(int a[]){
        int max=0;
        int index=-1;
        if (a.length==0){
            return new Pair(0,0);
        }
        else
            for (int i = 0; i < a.length; i++) {
                if(a[i]>max)
                { max=a[i];
                    index=i;}
            }
            return new Pair(max,index+1);



    }

}

