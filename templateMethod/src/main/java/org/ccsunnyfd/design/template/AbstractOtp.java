package org.ccsunnyfd.design.template;

/**
 * AbstractOtp
 *
 * @version 1.0
 */
public abstract class AbstractOtp {
    public final boolean genAndSendOTP(int otpLength) {
        String message = genMessage(otpLength);
        return sendNotification(message);
    }

    protected abstract String genMessage(int len);
    protected abstract boolean sendNotification(String message);
}
