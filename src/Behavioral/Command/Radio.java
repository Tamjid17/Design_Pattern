package Behavioral.Command;

public class Radio implements ElectronicsDevice{
    private int volume = 0;
    @Override
    public void on() {
        System.out.println("Radio is on");
    }

    @Override
    public void off() {
        System.out.println("Radio is off");
    }

    @Override
    public void up() {
        volume++;
        System.out.println("Volume is at " +volume);
    }

    @Override
    public void down() {
        volume--;
        System.out.println("Volume is at " +volume);
    }
}
