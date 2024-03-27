package initial;

import java.util.Random;
import java.util.Scanner;

public class FindRandom {
    public static void main(String[] args) {
        int MAX_ATTEMPTS = 5;
        int START_RANGE_NUMBER = 0;
        int END_RANGE_NUMBER = 100;

        int NUMBER_TO_FIND = new Random().nextInt(END_RANGE_NUMBER);
        int currentNumber;
        Scanner readNumber = new Scanner(System.in);

        System.out.println("Let's try to find a number!");

        String youAre;

        for (int index = MAX_ATTEMPTS; index > 0; index--) {
            System.out.printf("Which number do you think it is?\nThe number it should be between %d and %d", START_RANGE_NUMBER, END_RANGE_NUMBER);

            currentNumber = readNumber.nextInt();

            if (currentNumber == NUMBER_TO_FIND) {
                System.out.println("You found the number! It is: " + NUMBER_TO_FIND);
                break;
            }

            if (currentNumber > NUMBER_TO_FIND) {
                youAre = "BELLOW";
            } else {
                youAre = "ABOVE";
            }

            if (index == 1) {
                System.out.printf("##### Sorry! You didn't find the number. This is the number: %d", NUMBER_TO_FIND);
                break;
            }

            System.out.printf("The number is %s! You have %d attempts left!\n ", youAre, index - 1);
        }
    }
}
