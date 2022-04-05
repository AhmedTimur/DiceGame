package com.company;

import java.util.Random;
import java.util.Scanner;

public class SecondStage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(2,13);
        System.out.println("----- Start game -----");
        System.out.println("Predict amount of points from 2..12: ");
        int inputNumber = scanner.nextInt();
        while(inputNumber < 2 || inputNumber > 12) {
            System.out.println("Number should be between 2..12 try again...");
            inputNumber = scanner.nextInt();
        }
        System.out.println("User rolls the dices...");
        int a = Dice.rollTheDice();
        int b = Dice.rollTheDice();
        Dice.printDice(a);
        Dice.printDice(b);
        int userPoints = ((a+b)-Math.abs((a+b)-inputNumber)*2);
        System.out.println("On the dice fell " + (a+b) + " points");
        System.out.println("Result is " + (a+b) + "-abs" + "(" + (a+b) + "-"+ inputNumber + ")*2: " + userPoints);

        System.out.println();

        System.out.println("Computer predicted " + randomNumber + " points");
        System.out.println("Computer rolls the dices...");
        int c = Dice.rollTheDice();
        int d = Dice.rollTheDice();
        Dice.printDice(c);
        Dice.printDice(d);
        int cpuPoints = ((c+d)-Math.abs((c+d)-randomNumber)*2);
        System.out.println("On the dice fell " + (c+d) + " points");
        System.out.println("Result is " + (c+d) + "-abs" + "(" + (c+d) + "-"+ randomNumber + ")*2: " + cpuPoints);

        System.out.println();

        if (userPoints > cpuPoints)
            System.out.println("User win with " + (userPoints - cpuPoints) + " points more");
        if (cpuPoints > userPoints)
            System.out.println("Cpu win with " + (cpuPoints - userPoints) + " points more");
        if (cpuPoints == userPoints)
            System.out.println("The result is same!");
    }
}
