package project;

import java.text.NumberFormat;
import java.util.Locale;

public class BankAccount {
    private String name;
    private String accountType;
    private double balance;

    private String LOCALE = String.valueOf(Locale.US);

    BankAccount(String name, String accountType, double balance) {
        this.name = name;
        this.accountType = accountType;
        this.balance = balance;
    }

    // GETTERS and SETTERS
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getFormattedBalance() {
        return this._getFormatted(this.balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // METHODS
    private String _getFormatted(double value) {
        NumberFormat nf = NumberFormat.getInstance(Locale.of(this.LOCALE));

        return nf.format(value);
    }

    public void receiveValue(double value) {
        this.setBalance(this.getBalance() + value);
    }

    public void transferValue(double value) {
        if (!(value > this.getBalance())) {
            this.setBalance(this.getBalance() - value);
        }
    }
}
