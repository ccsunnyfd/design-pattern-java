package org.ccsunnyfd.design;

import org.ccsunnyfd.design.command.ConcreteCommandA;
import org.ccsunnyfd.design.command.ConcreteCommandB;
import org.ccsunnyfd.design.command.ICommand;
import org.ccsunnyfd.design.invoker.Invoker;
import org.ccsunnyfd.design.receiver.ReceiverA;
import org.ccsunnyfd.design.receiver.ReceiverB;

/**
 * Demo
 *
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        //通过请求者（invoker）调用命令对象（command），命令对象中调用了命令具体执行者（Receiver）
        ICommand command = new ConcreteCommandA(new ReceiverA());
        Invoker invoker = new Invoker(command);
        invoker.call();

        command = new ConcreteCommandA(new ReceiverB());
        invoker = new Invoker(command);
        invoker.call();

        command = new ConcreteCommandB(new ReceiverA());
        invoker = new Invoker(command);
        invoker.call();
    }
}
