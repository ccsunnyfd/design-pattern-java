package org.ccsunnyfd.design.payChannel;

import org.ccsunnyfd.design.payMode.IPayMode;

import java.math.BigDecimal;

/**
 * AliyunPay
 *
 * @version 1.0
 */
public class AliPay extends AbstractPay {
    public AliPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public boolean transfer(BigDecimal amount) {
        System.out.println("支付宝支付转账。。。");
        return true;
    }
}
