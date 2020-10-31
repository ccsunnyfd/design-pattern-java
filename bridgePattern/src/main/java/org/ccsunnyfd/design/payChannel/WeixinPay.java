package org.ccsunnyfd.design.payChannel;

import org.ccsunnyfd.design.payMode.IPayMode;

import java.math.BigDecimal;

/**
 * WeixinPay
 *
 * @version 1.0
 */
public class WeixinPay extends AbstractPay {
    public WeixinPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public boolean transfer(BigDecimal amount) {
        System.out.println("微信支付转账。。。");
        return true;
    }
}
