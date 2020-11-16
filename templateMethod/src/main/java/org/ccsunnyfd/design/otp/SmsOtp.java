package org.ccsunnyfd.design.otp;

import org.ccsunnyfd.design.template.AbstractOtp;

/**
 * SmsOtp
 *
 * @version 1.0
 */
public class SmsOtp extends AbstractOtp {
    @Override
    protected String genMessage(int len) {
        return "SMS message: " + len;
    }

    @Override
    protected boolean sendNotification(String message) {
        System.out.printf("SMS: sending sms: %s\n", message);
        return true;
    }
}
