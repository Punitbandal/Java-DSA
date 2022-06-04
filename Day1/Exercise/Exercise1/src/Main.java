public class Main {
    public static void main(String[] args) {


       System.out.println("1.Write a Java program that takes two numbers as input and display the product of two numbers.");
        System.out.println(ProductOfTwoNum.ProductOfTwoNum());

        System.out.println("2.Write a Java program to print the area and perimeter of a circle.");
        System.out.println("Area Of Circle "+AreaCircle.area());
        System.out.println("Parameter Of Circle "+AreaCircle.parameter());

        System.out.println("Write a Java program that reads a number in inches, converts it to meters.\n");
        System.out.println(InchesToMeters.inchesToMeters());

        System.out.println("Take three numbers from the user and print the greatest number.\n");
        System.out.println("greatest number is :"+MaxOfThree.maxOfThree());

        System.out.println("Write a Java program that takes a year from user and print whether that year is a leap year or not.");
        LeapYear.leapYear();
        System.out.println("Write a Java program to swap two numbers.\n");
        SwapNumbers.swapNumbers();
        SwapNumbers.swapNumbersWithoutTemp();

        System.out.println("Write a Java program to grade students based on their marks.");
        GradeOfStudent.gradeOfStudent();



    }
}