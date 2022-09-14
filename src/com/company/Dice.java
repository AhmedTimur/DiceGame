package com.company;

import java.util.Map;
import java.util.Random;

public class Dice {

    public static Map<Integer, String> sides = Map.of(
            1,"+-------+\n|       |\n|   #   |\n|       |\n+-------+",
            2,"+-------+\n| #     |\n|       |\n|     # |\n+-------+",
            3,"+-------+\n| #     |\n|   #   |\n|     # |\n+-------+",
            4,"+-------+\n| #   # |\n|       |\n| #   # |\n+-------+",
            5,"+-------+\n| #   # |\n|   #   |\n| #   # |\n+-------+",
            6,"+-------+\n| #   # |\n| #   # |\n| #   # |\n+-------+");

    public static void printDice(int value) {
        System.out.println(Dice.sides.get(value));
    }

    public static int rollTheDice() {
        Random random = new Random();
        return random.nextInt(7);
    }
}
