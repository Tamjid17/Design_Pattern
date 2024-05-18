package Behavioral.Command;

public class Client {
    public static void main(String[] args) {
        ElectronicsDevice device = new Radio();
        TurnDeviceOn oncommand = new TurnDeviceOn(device);
        DeviceButton button = new DeviceButton(oncommand);
        button.press();
    }
}
