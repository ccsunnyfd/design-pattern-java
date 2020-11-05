package org.ccsunnyfd.design;

/**
 * Demo
 *
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        WalletFacade wf = new WalletFacade("abc", 1234);
        System.out.println();

        if(!wf.addMoneyToWallet("abc", 1234, 10)) {
            System.out.println("error!");
            return;
        }
        System.out.println();

        if(!wf.deductMoneyFromWallet("abc", 1234, 5)) {
            System.out.println("error!");
        }
    }

}
