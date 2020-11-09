package org.ccsunnyfd.design.receiver;

/**
 * ReceiverA 接收者：真正执行命令的对象
 *
 * @version 1.0
 */
public class ReceiverA implements IReceiver {
    @Override
    public void action(String commandContent) {
        System.out.printf("ReceiverA执行了命令%s.......\n", commandContent);
    }
}
