public class SmallestNum {
    public static void main(String[] args) {

        System.out.println("smallest number among three numbers(MethodCall):"+smallestNum(22,52,32));
    }
    public static int smallestNum(int a,int b,int c){
        System.out.println("Write a Java method to find the smallest number among three numbers.\n"
        +"Numbers are :"+a+" "+b+" "+c);
    if ((a<b)&&(a<c))
        return a;
    else if((b<a)&&b<c)
        return b;
    else
        return c;

    }
}
   /* Write a Java method to find the smallest number among three numbers.
        Numbers are :22 52 32
        smallest number among three numbers(MethodCall):22

        Process finished with exit code 0*/