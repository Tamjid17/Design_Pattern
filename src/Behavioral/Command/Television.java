package Behavioral.Command;

public class Television implements ElectronicsDevice{
    private int volume = 0;
    @Override
    public void on() {
        System.out.println("TV is on");
    }

    @Override
    public void off() {
        System.out.println("TV is off");
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
