package org.ccsunnyfd.design.command;

import org.ccsunnyfd.design.receiver.IReceiver;

/**
 * ConcreteCommandB 具体命令类
 *
 * @version 1.0
 */
public class ConcreteCommandB implements ICommand{
    private IReceiver receiver;//持有真正执行命令对象的引用
    public ConcreteCommandB(IReceiver receiver) {
        super();
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        //调用接收者执行命令的方法
        receiver.action("ConcreteCommandB");
    }
}