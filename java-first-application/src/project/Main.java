package project;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private String name;
    private double balance;

    private BankAccount bankAccount;

    private Main instance;

    public void askPersonalInfo() {
        Scanner readOption = new Scanner(System.in);

        System.out.println("""
        #############################
        # Welcome to Carlohcs Bank! #
        #############################
        \n
        Please inform your name:""");

        name = readOption.nextLine();

        System.out.println("Please inform your balance:");

        balance = readOption.nextDouble();

        this.bankAccount = new BankAccount(name, "Fixed", balance);
    }
    public void showOptions() {
        System.out.println("""
            \nOperations:
            \n1 - Check balance
            2 - Receive value
            3 - Transfer
            4 - Exit
            #############################
            """);
    }

    public static void main(String[] args) {
        Main instance = new Main();

        instance.askPersonalInfo();

        instance.handleApplication();
    }

    public void handleApplication() {
        this.showOptions();

        Integer[] options = {1, 2, 3, 4};

        Scanner readOption = new Scanner(System.in);

        int choice = 0;
        boolean isValidChoice = true;
        boolean shouldExit = false;

        do {
            choice = readOption.nextInt();
            isValidChoice = Arrays.asList(options).contains(choice);

            if (choice == 4) {
                shouldExit = true;
            }

            if(!isValidChoice) {
                System.out.println("Invalid option.");

                this.showOptions();

                continue;
            }

            System.out.println("Option chose: " + choice);

            this.processChoice(choice);
        }
        while (!shouldExit);

        if (shouldExit) {
            System.out.println("""
                \n#############################
                Thanks for using Carlohcs Bank!
                #############################"""
            );

            System.exit(0);
        }
    }

    public void processChoice(int choice) {
        String message;
        Scanner readData = new Scanner(System.in);

        switch (choice) {
            case 1: // Check balance
                message = String.format("You have: %s\n", bankAccount.getFormattedBalance());
            break;
            case 2: // Receive value
                System.out.println("How much do you want to receive?");

                double receiveValue = readData.nextDouble();
                this.bankAccount.receiveValue(receiveValue);

                message = String.format("Current value now: %s\n", bankAccount.getFormattedBalance());
            break;
            case 3: // Transfer
                System.out.println("How much do you want to transfer?");

                double transferValue = readData.nextDouble();

                if (transferValue > bankAccount.getBalance()) {
                    message = "Amount is more then balance. Try with a different value.";
                    break;
                }
                this.bankAccount.transferValue(transferValue);

                message = String.format("Current value now: %s\n", bankAccount.getFormattedBalance());
            break;
            default:
                message = "";
        }

        if (choice != 4) {
            System.out.println(message);

            this.showOptions();
        }
    }
}
