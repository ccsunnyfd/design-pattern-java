package org.ccsunnyfd.design.payMode;

/**
 * FacePay
 *
 * @version 1.0
 */
public class FaceMode implements IPayMode {
    @Override
    public boolean securityCheck() {
        System.out.println("人脸识别");
        return true;
    }
}
