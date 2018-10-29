package command;

import command.command.ICommand;

/**
 * Created by wenzhi on 2018/10/24.
 */
public class Invoker {
    private ICommand mCommand;

    public Invoker(ICommand command) {
        this.mCommand = command;
    }

    public void action() {
        this.mCommand.execute();
    }

    public void unAction() {
        this.mCommand.undo();
    }

}
