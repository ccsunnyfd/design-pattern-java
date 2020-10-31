package org.ccsunnyfd.design.payMode;

/**
 * FingerPrintPay
 *
 * @version 1.0
 */
public class FingerPrintMode implements IPayMode {
    @Override
    public boolean securityCheck() {
        System.out.println("指纹验证");
        return true;
    }
}
