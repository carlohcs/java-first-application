package initial;

import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) {
        // if you are waiting for a specific data type
        // and application receives another one
        // we will have an exception
        // it's possible to define the locale on this
        // new Scanner
        // more info: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html
        Scanner readData = new Scanner(System.in);

        System.out.println("Write your favorite movie");
        String movie = readData.nextLine();

        System.out.println("Release year?");
        int year = readData.nextInt();

        // use , -> otherwise we will get an exception
        System.out.println("How much stars?");
        double stars = readData.nextDouble();

        System.out.println("You preferred movie is: " + movie);
        System.out.println("Release year: " + year);
        System.out.println("Stars: " + stars);

        readData.close();
    }
}
