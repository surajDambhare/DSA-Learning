package LogicBuilding.ConditionalThinking;

import javax.imageio.ImageReader;
import java.util.Scanner;

//Level 2: Nested If & Multiple Conditions
public class LevelTwo {
    //1. Take three sides and check if they form a valid triangle.
    public static void isTriangleValid(int a, int b, int c){
        // All sides must be positive and satisfy the triangle inequality theorem
        if((a > 0) && (b > 0) && (c > 0) && (a + b > c) && (a + c > b) && (b + c > a)){
            System.out.println("VALID TRIANGLE");
        }else {
            System.out.println("INVALID TRIANGLE");
        }
    }

    //2. If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene.
    //Equilateral: All three sides are equal (a == b and b == c).
    //Isosceles: Exactly two sides are equal (a == b or b == c or a == c).
    // Scalene: All three sides are different (a != b and b != c and a != c).
    public static void checkTriangle(int a, int b, int c){
        if((a > 0) && (b > 0) && (c > 0) && (a + b > c) && (a + c > b) && (b + c > a)){
            System.out.println("VALID TRIANGLE");
            if(a == b && b == c){
                System.out.println("EQUILATERAL TRIANGLE!");
            }else if(a == b || b == c || a == c){
                System.out.println("ISOSCELES TRIANGLE!");
            }else if(a != b && b != c && c != a){
                System.out.println("SCALENE TRIANGLE");
            }
        }else {
            System.out.println("INVALID TRIANGLE");
        }

    }


    //3. Take marks (0–100) and print the corresponding grade (A/B/C/D/F).
    public static char checkGrade(int marks){
        if(marks >= 85 && marks <= 100){
            return 'A';
        }else if(marks >= 75 && marks < 85){
            return 'B';
        }else if(marks >= 65 && marks < 75){
            return 'C';
        }else if(marks >= 35 && marks < 65){
            return 'D';
        }else{
            return 'F';
        }
    }
    //4. Check if one of two given numbers is a multiple of the other.

    //5. Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “Good
    //Evening”, or “Good Night”.
    //6. Check voting eligibility for a given age (18+).
    //7. Take two numbers and determine whether both are even, both are odd, or one is
    //even and one is odd.
    //8. Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’.
    //9. Take a day number (1–7) and print the corresponding day name.
    //10. Take a month number (1–12) and print the number of days in that month (ignore leap
    //years).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        for(int i = 0; i < 3; i++) {
//            System.out.println("Enter Side 1 : ");
//            int a = sc.nextInt();
//
//            System.out.println("Enter Side 2 : ");
//            int b = sc.nextInt();
//
//            System.out.println("Enter Side 3 : ");
//            int c = sc.nextInt();
//
//            isTriangleValid(a, b, c);
//            checkTriangle(a, b, c);
//        }

        System.out.println(checkGrade(35));
        System.out.println(checkGrade(0));
        System.out.println(checkGrade(75));
        System.out.println(checkGrade(100));
        System.out.println(checkGrade(65));

    }
}
