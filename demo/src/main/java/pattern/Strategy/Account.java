package pattern.Strategy;

import java.util.Random;

public class Account {
    final int ID;
    String accountHolder;
    double balance;

    public Account(String accountHolder, double startingBalance) {
        this.ID = new Random().nextInt(100000, 999999);
        this.accountHolder = accountHolder;
        this.balance = startingBalance;
    }

    boolean changeBalance(double amount) {
        if (changePermitted(amount)) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public int getID() {
        return ID;
    }
    
    private boolean changePermitted(double amount) {
        return ((this.balance + amount) > 0.0);
    }
}