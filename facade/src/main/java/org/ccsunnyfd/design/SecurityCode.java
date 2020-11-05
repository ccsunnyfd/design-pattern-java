package org.ccsunnyfd.design;

import lombok.AllArgsConstructor;

/**
 * SecurityCode
 *
 * @version 1.0
 */
@AllArgsConstructor
public class SecurityCode {
    private int code;

    public boolean checkCode(int code) {
        boolean check = this.code == code;
        if (!check) {
            System.out.println("Security Code is incorrect");
        } else {
            System.out.println("SecurityCode Verified");
        }
        return check;
    }
}
