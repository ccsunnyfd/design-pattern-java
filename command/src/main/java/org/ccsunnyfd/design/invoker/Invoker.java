package org.ccsunnyfd.design.invoker;

import org.ccsunnyfd.design.command.ICommand;

/**
 * Invoker 请求者/调用者：发起执行命令请求的对象
 *
 * @version 1.0
 */
public class Invoker {
    private ICommand command;//持有命令对象的引用
    public Invoker(ICommand command) {
        super();
        this.command = command;
    }
    public void call(){
        //请求者调用命令对象执行命令的那个execute方法
        command.execute();
    }
}