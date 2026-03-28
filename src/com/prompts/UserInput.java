// Write a program that prompts the user to input a number. The program should then output the
// number and a message saying whether the number is positive, negative, or zero.

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = scan.nextInt();
        if (n > 0)
            System.out.println(n + ":is a positive number");
        else if (n < 0)
            System.out.println(n + ": is a negative number");
        else
            System.out.println(n + ": is zero");
    }
}