package Behavioral.Command;

public class TurnDeviceUp implements Command{
    ElectronicsDevice device;
    public TurnDeviceUp(ElectronicsDevice device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.up();
    }

    @Override
    public void undo() {
        device.down();
    }
}
