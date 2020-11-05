package org.ccsunnyfd.design;

/**
 * Ledger
 *
 * @version 1.0
 */
public class Ledger {
    public void makeEntry(String accountID, String txnType, int amount) {
        System.out.printf("Make ledger entry for accountID %s with txnType %s for amount %d\n", accountID, txnType, amount);
    }
}
