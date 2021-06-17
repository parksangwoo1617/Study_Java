package aboutInterface;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl() {
            public void turnOn() {};
            public void turnOff() {};
            public void setVolume(int volume) {};
        };
        RemoteControl remote;
        remote = new Television();
        remote.turnOn();
        remote.setMute(true);

        remote = new Audio();
        remote.turnOn();
        remote.setMute(true);
    }
}
