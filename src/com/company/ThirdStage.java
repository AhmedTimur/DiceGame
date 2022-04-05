package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ThirdStage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int i = 1;

        List<Integer> cpuList = new ArrayList<>();
        List<Integer> userList = new ArrayList<>();

        while ( i <= 3) {
            int randomNumber = random.nextInt(2, 13);
            System.out.println("----- Start game ----- ROUND " + i);
            System.out.println("Predict amount of points from 2..12: ");
            int inputNumber = scanner.nextInt();
            System.out.println("User rolls the dices...");
            int a = Dice.rollTheDice();
            int b = Dice.rollTheDice();
            Dice.printDice(a);
            Dice.printDice(b);
            int userPoints = ((a + b) - Math.abs((a + b) - inputNumber) * 2);
            System.out.println("On the dice fell " + (a + b) + " points");
            System.out.println("Result is " + (a + b) + "-abs" + "(" + (a + b) + "-" + inputNumber + ")*2: " + userPoints);

            System.out.println();

            System.out.println("Computer predicted " + randomNumber + " points");
            System.out.println("Computer rolls the dices...");
            int c = Dice.rollTheDice();
            int d = Dice.rollTheDice();
            Dice.printDice(c);
            Dice.printDice(d);
            int cpuPoints = ((c + d) - Math.abs((c + d) - randomNumber) * 2);
            System.out.println("On the dice fell " + (c + d) + " points");
            System.out.println("Result is " + (c + d) + "-abs" + "(" + (c + d) + "-" + randomNumber + ")*2: " + cpuPoints);

            System.out.println();

            System.out.println("------- ROUND " + i + " -------- Current Score -------");
            System.out.println("User: " + userPoints);
            System.out.println("Computer: " + cpuPoints);

            if (userPoints > cpuPoints) {
                System.out.println("User win with " + (userPoints - cpuPoints) + " points more");
                userList.add(inputNumber);
                userList.add(a+b);
                userList.add(userPoints);

                cpuList.add(randomNumber);
                cpuList.add(c+d);
                cpuList.add(cpuPoints);
            }
            if (cpuPoints > userPoints) {
                System.out.println("Computer win with " + (cpuPoints - userPoints) + " points more");
                cpuList.add(randomNumber);
                cpuList.add(c+d);
                cpuList.add(cpuPoints);

                userList.add(inputNumber);
                userList.add(a+b);
                userList.add(userPoints);

            }

            System.out.println("-------------------------------------------");

            i++;
        }
        System.out.println();
        System.out.println("------- Finish Game -------");
        System.out.println();
        System.out.println(" ROUND |           User |      Computer ");

        int counter = 0;
        for(int k = 0; k < 3; k++) {
            System.out.println("-------+----------------+----------------");
                System.out.println("       | Predicted:  " + userList.get(counter) + "  | Predicted:  " + cpuList.get(counter));
                counter++;
                System.out.println(" - " + (k+1) + " - | Dice:       " + userList.get(counter) + "  | Dice:       " + cpuList.get(counter));
                counter++;
                System.out.println("       | Result:     " + userList.get(counter) + "  | Result:     " + cpuList.get(counter));
                counter++;
            }

        System.out.println("-------+----------------+----------------");

        int userSum = userList.stream().mapToInt(Integer::intValue).sum();
        int cpuSum = cpuList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(" Total | Points:     " + userSum + " | Computer:   " + cpuSum);

        System.out.println();

        if (userSum > cpuSum)
            System.out.println("User win with " + (userSum - cpuSum) + " points more. Congratulations!");
        if (userSum < cpuSum)
            System.out.println("Computer win with " + (cpuSum - userSum) + " points more. Congratulations!");
        if (userSum == cpuSum)
            System.out.println("The result is same!");


    }
}
