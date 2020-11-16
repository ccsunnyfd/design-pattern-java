package org.ccsunnyfd.design.otp;

import org.ccsunnyfd.design.template.AbstractOtp;

/**
 * EmailOtp
 *
 * @version 1.0
 */
public class EmailOtp extends AbstractOtp {
    @Override
    protected String genMessage(int len) {
        return "EMAIL message: " + len;
    }

    @Override
    protected boolean sendNotification(String message) {
        System.out.printf("EMAIL: sending email: %s\n", message);
        return true;
    }
}
