package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        try {
            int x;
            System.out.println("Enter an integer");
            Scanner in = new Scanner(System.in);
            x = in.nextInt();

            if (x % 2 == 0)
                System.out.println("This is an even number");
            else
                System.out.println("This is an odd number");
        }
        catch(InputMismatchException exception) {
            System.out.println("This is not an integer, please try again");
        }
    }
}

