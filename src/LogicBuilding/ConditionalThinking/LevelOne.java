package LogicBuilding.ConditionalThinking;

import java.util.Stack;

//Level 1: Simple Conditions (Getting started)
public class LevelOne {
    //1. Take a number and print whether it’s positive, negative, or zero.
    public static void checkNumberType(int number){
        if(number == 0){
            System.out.println("Number is Zero");
        }else if(number > 0){
            System.out.println("Number is Positive");
        }else{
            System.out.println("Number is Negative");
        }
    }

    //2. Check if a number is even or odd.
    public static void isNumberEvenOrOdd(int number){
        if(number % 2 == 0){
            System.out.println("Number is Even!");
        }else{
            System.out.println("Number is Odd!");
        }
    }

    //3. Check if a number is divisible by 5.
    public static void isNumberDivisibleByFive(int number){
        if(number % 5 == 0){
            System.out.println("Number is Divisible By 5");
        }else{
            System.out.println("Number is not Divisible By 5");
        }
    }

    //4. Check if a number is divisible by both 3 and 5.
    public static void isNumberDivisibleByThreeAndFive(int number){
        if(number % 3 == 0 && number % 5 == 0){
            System.out.println("Number is Divisible By 5 And 3");
        }else {
            System.out.println("Number is not Divisible By 5 And 3");
        }
    }


    //5. Check if a given year is a leap year.
    //If the year is divisible by 4 but not by 100,
    //OR divisible by 400,
    //then it is a leap year.
    //4 → YES
    //100 → NO
    //400 → YES AGAIN
    public static void isLeapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Leap Year!");
        }else{
            System.out.println("Not Leap Year!");
        }
    }
    //6. Take two numbers and print the larger one.
    public static void largerNumber(int number1, int number2){
        if(number1 == number2){
            System.out.println("Both Numbers are Equal!");
        }else if(number1 > number2){
            System.out.println("Larger Number : " + number1);
        }else {
            System.out.println("Larger Number : " + number2);
        }
    }

    //7. Take three numbers and print the largest.
    public static void largerNumberBetweenThree(int number1, int number2, int number3){
        if(number1 >= number2 && number1 >= number3){
            System.out.println("Larger Number : " + number1);
        }else if(number2 >= number1 && number2 >= number3){
            System.out.println("Larger Number : " + number2);
        }else {
            System.out.println("Larger Number : " + number3);
        }
    }

    //8. Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions.
    public static void checkTemperature(int temperature){
        if(temperature <= 20){
            System.out.println("Today's Weather is Cold");
        }else if(temperature > 20 && temperature <= 30){
            System.out.println("Today's Weather is Warm");
        }else {
            System.out.println("Today's Weather is Hot");
        }
    }

    //9. Take a character and check if it’s a vowel or consonant
    public static void isVowelOrConsonant(char ch){
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' ||
                   ch == 'I' || ch == 'O' || ch == 'U'){
                System.out.println("Character is Vowel");
            }else {
                System.out.println("Character is Consonant");
            }
        }else{
            System.out.println("Character is Digit or Special Character");
        }
    }

    //10. Take a character and check whether it’s uppercase, lowercase, a digit, or a special
    //character.
    public static void checkUppercaseLowercaseDigitSpecial(char ch){
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("UPPERCASE CHARACTER : " + ch);
        }else if(ch >= 'a' && ch <= 'z'){
            System.out.println("lowercase character : " + ch);
        }else if(ch >= '0' && ch <= '9'){
            System.out.println("DIGIT : " + ch);
        }else {
            System.out.println("SPECIAL : " + ch);
        }
    }

    public static void main(String[] args) {
         checkNumberType(0);
         isNumberEvenOrOdd(20);
         isLeapYear(1900);
         isNumberDivisibleByFive(15);
         isNumberDivisibleByThreeAndFive(30);
         checkTemperature(35);
         largerNumber(54, 55);
         largerNumberBetweenThree(85, 87, 89);
         isVowelOrConsonant('a');
         checkUppercaseLowercaseDigitSpecial('9');
    }
}
