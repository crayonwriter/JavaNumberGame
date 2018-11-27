package com.crayonwriter.javaenvironment;

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
int randomNumber = (int) (Math.random() * 100) + 1;
boolean hasWon = false;

System.out.println("I have randomly chosen a number between 1 and 100.");
System.out.println("Try to guess it.");

Scanner scanner = new Scanner(System.in);

for (int i=10; i > 0; i--) {
    System.out.println("You have " + i + " guesses left.");
    int guess = scanner.nextInt();

    if (guess > randomNumber) {
        System.out.println("Sorry, your guess " + guess + " is too high.");
    } else if (guess < randomNumber) {
        System.out.println("Sorry, your guess " + guess + " was too low.");
    } else {
        hasWon = true;
        break;
    }
}

if (hasWon) {
    System.out.println("Correct! You won!");
} else {
    System.out.println("Sorry. You lose. The correct number was " + randomNumber + ".");
}
    }
}
