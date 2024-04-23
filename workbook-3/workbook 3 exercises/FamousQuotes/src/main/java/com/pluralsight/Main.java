package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        String[] quotes = {
                "The only way to do great work is to love what you do. - Steve Jobs",
                "In the end, we only regret the chances we didn't take. - Unknown",
                "Believe you can and you're halfway there. - Theodore Roosevelt",
                "Life is what happens when you're busy making other plans. - John Lennon",
                "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt",
                "It does not matter how slowly you go as long as you do not stop. - Confucius",
                "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
                "The only limit to our realization of tomorrow will be our doubts of today. - Franklin D. Roosevelt",
                "The best time to plant a tree was 20 years ago. The second best time is now. - Chinese Proverb",
                "Don't watch the clock; do what it does. Keep going. - Sam Levenson"
        };

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10 to display the corresponding quote: ");
        try{
            int selection = userInput.nextInt();
            if (selection >= 1 && selection <= 10) {
            System.out.println(quotes[selection - 1]);
        } else {
            System.out.println("Invalid selection. Please choose a number between 1 and 10.");
        }

        } catch (Exception e){
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            userInput.close();
        }
        }

}