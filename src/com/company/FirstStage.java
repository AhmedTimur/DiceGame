package com.company;

import java.util.Scanner;

public class FirstStage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Start game -----");
        System.out.println("Predict amount of points from 2..12: ");
        int inputNumber = scanner.nextInt();
        while(inputNumber < 2 || inputNumber > 12) {
            System.out.println("Number should be between 2..12 try again...");
            inputNumber = scanner.nextInt();
        }
        System.out.println("User rolls the dice...");
        int a = Dice.rollTheDice();
        int b = Dice.rollTheDice();
        Dice.printDice(a);
        Dice.printDice(b);
        System.out.println("On the dice fell " + (a+b) + " points");
        System.out.println("Result is " + (a+b) + "-abs" + "(" + (a+b) + "-"+ inputNumber + ")*2: " + ((a+b) -Math.abs((a+b) - inputNumber)) );



    }
}
