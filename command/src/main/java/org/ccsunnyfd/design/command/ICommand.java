package org.ccsunnyfd.design.command;

/**
 * ICommand 抽象命令类：抽象的命令，可以根据不同类型的命令写出不同的实现
 *
 * @version 1.0
 */
public interface ICommand {
    //调用命令
    void execute();
}
