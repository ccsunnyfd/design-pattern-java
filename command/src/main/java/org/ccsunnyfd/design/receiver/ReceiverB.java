package org.ccsunnyfd.design.receiver;

/**
 * ReceiverB 接收者：真正执行命令的对象
 *
 * @version 1.0
 */
public class ReceiverB implements IReceiver {
    @Override
    public void action(String commandContent) {
        System.out.printf("ReceiverB执行了命令%s.......\n", commandContent);
    }
}
