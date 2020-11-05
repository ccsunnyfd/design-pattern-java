package org.ccsunnyfd.design;

/**
 * Wallet
 *
 * @version 1.0
 */
public class Wallet {
    private int balance;

    public Wallet() {
        this.balance = 0;
    }

    public void creditBalance(int amount) {
        this.balance += amount;
        System.out.printf("Wallet balance added %d\n", amount);
    }

    public boolean debitBalance(int amount) {
        if (this.balance < amount) {
            System.out.println("Balance is not sufficient");
            return false;
        }

        this.balance -= amount;
        System.out.printf("Wallet balance deduced %d\n", amount);
        return true;
    }
}
