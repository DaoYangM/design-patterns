import command.Command;
import command.LightOffCommand;
import command.LightOnCommand;
import command.MaCroCommand;
import receiver.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        Light light = new Light();
        RemoteControl remoteControl = new RemoteControl();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        remoteControl.setCommand(0, new Command[]{lightOn}, new Command[]{lightOff});
        System.out.println(remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.undoButtonWasPressed();

//        MaCroCommand maCroCommand = new MaCroCommand(new Command[]{lightOn, lightOff});
    }
}
