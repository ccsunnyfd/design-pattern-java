package org.ccsunnyfd.design;

/**
 * WalletFacade
 *
 * @version 1.0
 */
public class WalletFacade {
    private Account account;
    private Wallet wallet;
    private SecurityCode securityCode;
    private Notification notification;
    private Ledger ledger;

    public WalletFacade(String accountID, int code) {
        System.out.println("Starting create account");
        this.account = new Account(accountID);
        this.securityCode = new SecurityCode(code);
        this.wallet = new Wallet();
        this.notification = new Notification();
        this.ledger = new Ledger();
        System.out.println("Account created");
    }

    public boolean addMoneyToWallet(String accountID, int securityCode, int amount) {
        System.out.println("Starting add money to wallet");
        if(!this.account.checkAccount(accountID)) {
            return false;
        }
        if(!this.securityCode.checkCode(securityCode)) {
            return false;
        }
        this.wallet.creditBalance(amount);
        this.notification.sendWalletCreditNotification();
        this.ledger.makeEntry(accountID, "credit", amount);
        return true;
    }

    public boolean deductMoneyFromWallet(String accountID, int securityCode, int amount) {
        System.out.println("Starting debit money from wallet");
        if(!this.account.checkAccount(accountID)) {
            return false;
        }
        if(!this.securityCode.checkCode(securityCode)) {
            return false;
        }
        if(!this.wallet.debitBalance(amount)) {
            return false;
        }
        this.notification.sendWalletDebitNotification();
        this.ledger.makeEntry(accountID, "debit", amount);
        return true;
    }
}
