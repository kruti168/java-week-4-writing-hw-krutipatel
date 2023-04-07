package java_week_4_homework;

import java.util.Scanner;

/**
 * Display left angle triangle of * using nested for loops
 *   *
 *   * *
 *   * * *
 *   * * * *
 *   * * * * *
 */
public class Programme_15_LeftTringleStar {

    public static void leftTringle(int x){
        int i,j;
        for (i = 1 ;i <= x ; i++){
            for (j = 1; j <= i; j++){

                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
    public static void main (String []args){
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int a = scanner.nextInt();
        leftTringle(a);
        //closing the scanner object
        scanner.close();
    }
}
