package org.ccsunnyfd.design.payChannel;

import org.ccsunnyfd.design.payMode.IPayMode;

import java.math.BigDecimal;

/**
 * AbstractPay
 *
 * @version 1.0
 */
public abstract class AbstractPay {
    protected IPayMode payMode;

    public AbstractPay() {}

    public AbstractPay(IPayMode payMode) {
        this.payMode = payMode;
    }

    public boolean pay(BigDecimal amount) {
        boolean checkValid = payMode.securityCheck();
        if(checkValid) {
            this.transfer(amount);
            return true;
        }
        return false;
    }

    public abstract boolean transfer(BigDecimal amount);
}
