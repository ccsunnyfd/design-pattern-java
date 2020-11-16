package org.ccsunnyfd.design.otp;

import org.ccsunnyfd.design.callback.IOtpCallback;

/**
 * Otp
 *
 * @version 1.0
 */
public class Otp {
    public final boolean genAndSendOTP(IOtpCallback callback, int otpLength) {
        String message = callback.genMessage(otpLength);
        return callback.sendNotification(message);
    }

    public final void singleMethodTest(IOtpCallback callback) {
        callback.singleMethod();
    }
}
