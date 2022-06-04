import java.util.Scanner;

public class GradeOfStudent {

    public static void gradeOfStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Marks:");
        int grade = sc.nextInt();


        if (grade >= 90)
            System.out.println("You got 'S' Grade");
        else if (grade >= 80)
            System.out.println("You got 'A' Grade");
        else if (grade >= 70)
            System.out.println("You got 'B' Grade");
        else if (grade >= 60)
            System.out.println("You got 'C' Grade");
        else if (grade >= 50)
            System.out.println("You got 'D' Grade");
        else if (grade >= 40)
            System.out.println("You got 'E' Grade");
        else if (grade < 40) {
            System.out.println("You got 'Fail' Grade");
        }
    }
}
   /* Write a Java program to grade students based on their marks.
        Enter The Marks:
        35
        You got 'Fail' Grade

Enter The Marks:
84
You got 'A' Grade

Process finished with exit code 0


        */