package command.command;

import command.Receiver;

/**
 * Created by wenzhi on 2018/10/24.
 */
public class ConcreteCommand implements ICommand {
    private Receiver mReceiver;

    public ConcreteCommand(Receiver receiver) {
        this.mReceiver = receiver;
    }

    @Override
    public void execute() {
        this.mReceiver.action();
    }

    @Override
    public void undo() {
        this.mReceiver.unAction();
    }
}
