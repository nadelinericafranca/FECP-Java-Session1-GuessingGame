package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNumber = (int)(Math.random() * 5) + 1;

        System.out.println("I'm thinking of a number between 1 and 5");

        for (int i = 0; i < 3; i++) {
            System.out.printf("Guess %d: ", i+1);
            int guess = input.nextInt();

            if (guess != secretNumber) {
                System.out.println("Wrong guess.");
            } else {
                System.out.println("You guessed it!");
                System.out.println("You win!");
                System.exit(0);
            }
        }
        System.out.printf("You lose. The correct number was %d", secretNumber);
    }
}
