package initial;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        double mediaAvaliation = 0;
        double currentAvaliation = 0;
        int MOVIES = 3;
        int totalNumbers = 0;

        // WITH FOR
        /*
        for (int i = 0; i < MOVIES; i++) {
            System.out.println("Stars?");
            currentAvaliation = readData.nextDouble();
            mediaAvaliation += currentAvaliation;
        }*/

        while (currentAvaliation != -1) {
            System.out.println("Stars? (-1 to exit)");
            currentAvaliation = readData.nextDouble();

            if(currentAvaliation != -1) {
                mediaAvaliation += currentAvaliation;
                totalNumbers++;
            }
        }

        // System.out.println("Final stars: " + String.format("%.2f", mediaAvaliation / MOVIES / 2));
        System.out.println("Final stars: " + String.format("%.2f", mediaAvaliation / MOVIES / totalNumbers));
    }
}
