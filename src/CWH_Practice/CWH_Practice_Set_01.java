package CWH_Practice;

import java.util.Scanner ;
public class CWH_Practice_Set_01 {

    public static void main(String[] args) {

        // -------------------------------------------------------------------------------------------------------------
      /*
        // Question No.1 
        // Write a program to sum three numbers in java

        System.out.println("Enter three numbers:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println("Sum of three numbers is: " + sum);
        */

        // -------------------------------------------------------------------------------------------------------------
    /*
        // Question No.2
        // Write a program to calculate CGPA using Marks of three subjects (Out of 100)

        System.out.println("Enter the Subjects Marks:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Total number of Maths Marks: ");
        int maths = sc.nextInt();
        System.out.println("Total number of Science Marks: ");
        int science = sc.nextInt();
        System.out.println("Total number of English Marks: ");
        int english = sc.nextInt();

        float average = (float) (maths + science + english) / 3;

        float cgpa = average / 10;

        sc.close();
        System.out.println("CGPA is: " + cgpa);

        */
        // -------------------------------------------------------------------------------------------------------------

        // Question no.3
        // Write a java program which asks the use to enter her/her name and greets them with "Hello<name>, hava a good day" text

    /*    System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", have a good day!");
        sc.close();

*/
        // -------------------------------------------------------------------------------------------------------------

        // Question no.4
        // Write a given program to convert kilometers to miles

    /*
        System.out.println("Enter Kilometre ");
        Scanner sc = new Scanner(System.in);
        float km = sc.nextFloat();
        float miles = km / 1.609f;
        System.out.println("Miles are " + miles);

        */

        // -------------------------------------------------------------------------------------------------------------

        // Question no.5
        // Write a java program to detect whether a number entered by the user is integer or not.

        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println(num + " is an Integer number");
        } else {
            System.out.println("The input is not an integer.");
        }
        sc.close();


    }
}
