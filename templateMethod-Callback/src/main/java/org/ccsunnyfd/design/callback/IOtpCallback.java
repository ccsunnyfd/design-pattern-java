package org.ccsunnyfd.design.callback;

/**
 * IOtpCallback
 *
 * @version 1.0
 */
public interface IOtpCallback {
    default String genMessage(int len) {
        return null;
    };

    default boolean sendNotification(String message) {
        return false;
    };

    default void singleMethod() {
        System.out.println("default singleMethod!");
    };
}
