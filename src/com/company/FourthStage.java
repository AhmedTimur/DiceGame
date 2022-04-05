package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FourthStage {
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
            System.out.println("Dou you want to cheat? Press 1 if yes, press 2 if no");
            int inputCheat = scanner.nextInt();

            int a = Dice.rollTheDice();
            int b = Dice.rollTheDice();
            int userPoints = a+b;

            int c = Dice.rollTheDice();
            int d = Dice.rollTheDice();
            int cpuPoints = c+d;

            int chance1 = random.nextInt(1,3);

            if(inputCheat == 1 && i == 1) {
                System.out.println("User rolls the dices...");
                if (chance1 == 1) {
                    Dice.printDice(inputNumber / 2);
                    Dice.printDice(inputNumber - (inputNumber / 2));
                    int sum1 = ((inputNumber / 2) + (inputNumber - (inputNumber / 2)));
                    userPoints = (sum1 - Math.abs((sum1) - inputNumber) * 2);
                    System.out.println("You successfully cheated");
                    System.out.println("On the dice fell " + (sum1) + " points");
                    System.out.println("Result is " + (sum1) + "-abs" + "(" + (sum1) + "-" + inputNumber + ")*2: " + userPoints);
                }
                else {
                    Dice.printDice(a);
                    Dice.printDice(b);
                    int sum1 = (a + b);
                    userPoints = ((sum1 - Math.abs((sum1) - inputNumber) * 2) - 10);
                    System.out.println("On the dice fell " + (sum1) + " points");
                    System.out.println("You failed to cheat and got -10 from result points penalty!");
                    System.out.println("Result is " + (sum1) + "-abs" + "(" + (sum1) + "-" + inputNumber + ")*2: " + userPoints);
                }
            }

            int chance2 = random.nextInt(1,4);

            if(inputCheat == 1 && i == 2) {
                System.out.println("User rolls the dices...");
                if (chance2 == 1) {
                    Dice.printDice(inputNumber / 2);
                    Dice.printDice(inputNumber - (inputNumber / 2));
                    int sum1 = ((inputNumber / 2) + (inputNumber - (inputNumber / 2)));
                    userPoints = (sum1 - Math.abs((sum1) - inputNumber) * 2);
                    System.out.println("You successfully cheated");
                    System.out.println("On the dice fell " + (sum1) + " points");
                    System.out.println("Result is " + (sum1) + "-abs" + "(" + (sum1) + "-" + inputNumber + ")*2: " + userPoints);
                }
                else {
                    Dice.printDice(a);
                    Dice.printDice(b);
                    int sum1 = (a + b);
                    userPoints = ((sum1 - Math.abs((sum1) - inputNumber) * 2) - 10);
                    System.out.println("On the dice fell " + (sum1) + " points");
                    System.out.println("You failed to cheat and got -10 from result points penalty!");
                    System.out.println("Result is " + (sum1) + "-abs" + "(" + (sum1) + "-" + inputNumber + ")*2: " + userPoints);
                }
            }

            int chance3 = random.nextInt(1,7);

            if(inputCheat == 1 && i == 3) {
                System.out.println("User rolls the dices...");
                if (chance3 == 1) {
                    Dice.printDice(inputNumber / 2);
                    Dice.printDice(inputNumber - (inputNumber / 2));
                    int sum1 = ((inputNumber / 2) + (inputNumber - (inputNumber / 2)));
                    userPoints = (sum1 - Math.abs((sum1) - inputNumber) * 2);
                    System.out.println("You successfully cheated");
                    System.out.println("On the dice fell " + (sum1) + " points");
                    System.out.println("Result is " + (sum1) + "-abs" + "(" + (sum1) + "-" + inputNumber + ")*2: " + userPoints);
                }
                else {
                    Dice.printDice(a);
                    Dice.printDice(b);
                    int sum1 = (a + b);
                    userPoints = ((sum1 - Math.abs((sum1) - inputNumber) * 2) - 10);
                    System.out.println("On the dice fell " + (sum1) + " points");
                    System.out.println("You failed to cheat and got -10 from result points penalty!");
                    System.out.println("Result is " + (sum1) + "-abs" + "(" + (sum1) + "-" + inputNumber + ")*2: " + userPoints);
                }
            }


            if(inputCheat == 2 && i ==1 ||
                    inputCheat == 2 && i ==2 ||
                    inputCheat == 2 && i ==3) {
                Dice.printDice(a);
                Dice.printDice(b);
                int sum1 = (a + b);
                userPoints = ((sum1 - Math.abs((sum1) - inputNumber) * 2));
                System.out.println("On the dice fell " + (sum1) + " points");
                System.out.println("Result is " + (sum1) + "-abs" + "(" + (sum1) + "-" + inputNumber + ")*2: " + userPoints);
            }

            System.out.println();

            int cpuChance1 = random.nextInt(1,3);
            int r = random.nextInt(1,3);
            System.out.println("Computer predicted " + randomNumber + " points");
            System.out.println("Computer rolls the dices...");
            if (cpuChance1 == 1 && i == 1) {
                if ( r == 1) {
                    Dice.printDice(randomNumber / 2);
                    Dice.printDice(randomNumber - (randomNumber / 2));
                    int sum2 = ((randomNumber / 2) + (randomNumber - (randomNumber / 2)));
                    cpuPoints = ((sum2) - Math.abs((sum2) - randomNumber) * 2);
                    System.out.println("Computer successfully cheated");
                    System.out.println("On the dice fell " + (sum2) + " points");
                    System.out.println("Result is " + (sum2) + "-abs" + "(" + (sum2) + "-" + randomNumber + ")*2: " + cpuPoints);
                } else {
                    Dice.printDice(c);
                    Dice.printDice(d);
                    cpuPoints = (((c + d) - Math.abs((c + d) - randomNumber) * 2) - 10);
                    System.out.println("Computer tried to cheat but got penalty. -10 points from result");
                    System.out.println("On the dice fell " + (c + d) + " points");
                    System.out.println("Result is " + (c + d) + "-abs" + "(" + (c + d) + "-" + randomNumber + ")*2: " + cpuPoints);
                }
            }

            int cpuChance2 = random.nextInt(1,5);
            if (cpuChance2 == 1 && i == 2) {
                if (r == 1) {
                    Dice.printDice(randomNumber / 2);
                    Dice.printDice(randomNumber - (randomNumber / 2));
                    int sum2 = ((randomNumber / 2) + (randomNumber - (randomNumber / 2)));
                    cpuPoints = ((sum2) - Math.abs((sum2) - randomNumber) * 2);
                    System.out.println("Computer successfully cheated");
                    System.out.println("On the dice fell " + (sum2) + " points");
                    System.out.println("Result is " + (sum2) + "-abs" + "(" + (sum2) + "-" + randomNumber + ")*2: " + cpuPoints);
                } else {
                    Dice.printDice(c);
                    Dice.printDice(d);
                    cpuPoints = (((c + d) - Math.abs((c + d) - randomNumber) * 2) - 10);
                    System.out.println("Computer tried to cheat but got penalty. -10 points from result");
                    System.out.println("On the dice fell " + (c + d) + " points");
                    System.out.println("Result is " + (c + d) + "-abs" + "(" + (c + d) + "-" + randomNumber + ")*2: " + cpuPoints);
                }
            }

            int cpuChance3 = random.nextInt(1,7);
            if (cpuChance3 == 1 && i == 3) {
                if (r == 1) {
                    Dice.printDice(randomNumber / 2);
                    Dice.printDice(randomNumber - (randomNumber / 2));
                    int sum2 = ((randomNumber / 2) + (randomNumber - (randomNumber / 2)));
                    cpuPoints = ((sum2) - Math.abs((sum2) - randomNumber) * 2);
                    System.out.println("Computer successfully cheated");
                    System.out.println("On the dice fell " + (sum2) + " points");
                    System.out.println("Result is " + (sum2) + "-abs" + "(" + (sum2) + "-" + randomNumber + ")*2: " + cpuPoints);
                } else {
                    Dice.printDice(c);
                    Dice.printDice(d);
                    cpuPoints = (((c + d) - Math.abs((c + d) - randomNumber) * 2) - 10);
                    System.out.println("Computer tried to cheat but got penalty. -10 points from result");
                    System.out.println("On the dice fell " + (c + d) + " points");
                    System.out.println("Result is " + (c + d) + "-abs" + "(" + (c + d) + "-" + randomNumber + ")*2: " + cpuPoints);
                }
            }
            else {
                Dice.printDice(c);
                Dice.printDice(d);
                cpuPoints = ((c + d) - Math.abs((c + d) - randomNumber) * 2);
                System.out.println("Computer didn't cheat");
                System.out.println("On the dice fell " + (c + d) + " points");
                System.out.println("Result is " + (c + d) + "-abs" + "(" + (c + d) + "-" + randomNumber + ")*2: " + cpuPoints);
            }

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
