public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacciSeries(10);
    }
    public static void  fibonacciSeries(int n){
        System.out.println("Write a Java method to print Fibonacci series of n terms where n is argument passed by user.");
        int a=0,b=1,c;
        System.out.println("Fibonacci series of "+n +" terms.");
        System.out.print(a+" "+b);
        for (int i = 2; i < n; i++) {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }

    }
}
   /* Write a Java method to print Fibonacci series of n terms where n is argument passed by user.
        Fibonacci series of 10 terms.
        0 1 1 2 3 5 8 13 21 34
        Process finished with exit code 0
*/