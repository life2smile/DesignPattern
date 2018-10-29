package command.command;

/**
 * Created by wenzhi on 2018/10/24.
 */
public interface ICommand {
    void execute();

    void undo();
}
