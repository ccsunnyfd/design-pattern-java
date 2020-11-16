package org.ccsunnyfd.design;

import org.ccsunnyfd.design.otp.EmailOtp;
import org.ccsunnyfd.design.otp.SmsOtp;
import org.ccsunnyfd.design.template.AbstractOtp;

/**
 * Demo
 *
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        AbstractOtp otp = new SmsOtp();
        otp.genAndSendOTP(4);

        otp = new EmailOtp();
        otp.genAndSendOTP(5);
    }
}
