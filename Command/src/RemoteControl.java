import command.Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class RemoteControl {
    private ArrayList<Command[]> onCommand;
    private ArrayList<Command[]> offCommand;
    private Stack<Command> undo = new Stack<>();
    private NoCommand noCommand = new NoCommand();

    public RemoteControl() {
        this.onCommand = new ArrayList<>(7);
        this.offCommand = new ArrayList<>(7);

        for (int i = 0; i < 7; i++) {
            this.onCommand.add(i, new Command[]{noCommand});
            this.onCommand.add(i, new Command[]{noCommand});
        }
    }

    public void setCommand(int index, Command[] onCommands, Command[] offCommands) {
        this.onCommand.add(index, onCommands);
        this.offCommand.add(index, offCommands);
    }

    public void onButtonWasPressed(int index) {
        Command[] commands = onCommand.get(index);

        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
            undo.push(commands[i]);
        }
    }

    public void offButtonWasPressed(int index) {
        Command[] commands = offCommand.get(index);

        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
            undo.push(commands[i]);
        }
    }

    public void undoButtonWasPressed() {
        undo.pop().undo();
    }


    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ Remote Control ------\n");

        for (int i = 0; i < offCommand.size(); i++) {
            stringBuilder.append("[slot " + i + "] " + onCommand.get(i).getClass().getName() + "   " + offCommand.get(i).getClass().getName() + "\n");
        }

        return stringBuilder.toString();
    }

    class NoCommand implements Command{

        @Override
        public void execute() {

        }

        @Override
        public void undo() {

        }
    }
}
