package org.ccsunnyfd.design;

import org.ccsunnyfd.design.payChannel.AbstractPay;
import org.ccsunnyfd.design.payChannel.AliPay;
import org.ccsunnyfd.design.payChannel.WeixinPay;
import org.ccsunnyfd.design.payMode.FaceMode;
import org.ccsunnyfd.design.payMode.FingerPrintMode;
import org.ccsunnyfd.design.payMode.IPayMode;

import java.math.BigDecimal;

/**
 * Demo
 *
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        IPayMode payMode = new FingerPrintMode();
        AbstractPay pay = new AliPay(payMode);
        pay.pay(new BigDecimal(2000));

        System.out.println("\n=================\n");

        payMode = new FaceMode();
        pay = new WeixinPay(payMode);
        pay.pay(new BigDecimal(1500));
    }
}
