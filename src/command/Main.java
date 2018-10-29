package command;

import command.command.ConcreteCommand;
import command.command.ICommand;

/**
 * Created by wenzhi on 2018/10/24.
 */
public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ICommand concreteCommand = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker(concreteCommand);
        invoker.action();
        invoker.unAction();
    }
}
