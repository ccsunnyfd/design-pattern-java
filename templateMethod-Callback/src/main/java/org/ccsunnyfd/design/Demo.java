package org.ccsunnyfd.design;

import org.ccsunnyfd.design.callback.IOtpCallback;
import org.ccsunnyfd.design.otp.Otp;

/**
 * Demo
 *
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Otp otp = new Otp();
        otp.genAndSendOTP(new IOtpCallback() {
            @Override
            public String genMessage(int len) {
                return "SMS: message" + len;
            }

            @Override
            public boolean sendNotification(String message) {
                System.out.println("SMS message: " + message);
                return true;
            }
        }, 4);

        otp.singleMethodTest(new IOtpCallback() {
            @Override
            public void singleMethod() {
                System.out.println("My customized singleMethod!");
            }
        });
    }
}
