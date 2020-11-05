package org.ccsunnyfd.design;

import lombok.AllArgsConstructor;

/**
 * Account
 *
 * @version 1.0
 */
@AllArgsConstructor
public class Account {
    private String name;

    public boolean checkAccount(String accountName) {
        boolean check = this.name.equals(accountName);
        if (!check) {
            System.out.println("Account Name is incorrect");
        } else {
            System.out.println("Account Verified");
        }
        return check;
    }
}
