package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // find all 7 questions in your workbook on page 
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();

    }

    // write ONLY code for QUESTION 1 in this function
    public static void question1() {
        // Question 1:
        // declare variables here
        int bobSalary = 100000;
        int garySalary = 50000;
        double highestSalary;

        // code the logic to the problem here
        highestSalary = Math.max(bobSalary, garySalary);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The answer is " + highestSalary);
    }


    // write ONLY code for QUESTION 2 in this function
    public static void question2() {
        // Question 2:
        // declare variables here
        int carPrice = 200;
        int truckPrice = 500;
        int lowestPrice;


        // code the logic to the problem here
        lowestPrice = Math.min(carPrice, truckPrice);


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The answer for number two is: " + lowestPrice);
    }


    // write ONLY code for QUESTION 3 in this function
    public static void question3() {
        // Question 3:
        // declare variables here
        //A = pie r2
        double radius = 7.25;
        double pi = Math.PI;
        double area;


        // code the logic to the problem here
        radius = Math.pow(7.25, 2);
        area = Math.PI * radius;


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("Area of a circle with a radius of 7.25 is : " + area);

    }


    // write ONLY code for QUESTION 4 in this function
    public static void question4() {
        // Question 4:
        // declare variables here
        double number = 5.0;


        // code the logic to the problem here
        double squareRoot = Math.sqrt(number);


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The square root of 5.0 is : " + squareRoot);
    }


    // write ONLY code for QUESTION 5 in this function
    public static void question5() {
        // Question 5:
        // declare variables here


        // code the logic to the problem here


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);

    }


    // write ONLY code for QUESTION 6 in this function
    public static void question6() {
        // Question 6:
        // declare variables here


        // code the logic to the problem here


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 7 in this function
    public static void question7() {
        // Question 7:
        // declare variables here


        // code the logic to the problem here


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }
}