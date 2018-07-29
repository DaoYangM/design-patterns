package command;

import java.util.Arrays;

public class MaCroCommand implements Command {
    private Command[] commands;

    public MaCroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        Arrays.stream(commands).forEach(Command::execute);
    }

    @Override
    public void undo() {
        Arrays.stream(commands).forEach(Command::undo);
    }
}
