package Behavioral.Command;

public class TurnDeviceOn implements Command{
    ElectronicsDevice device;
    public TurnDeviceOn(ElectronicsDevice device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
