package aboutInterface;

public class RemoteControlExample {
    public static void main() {
        RemoteControl rc = new RemoteControl() {
            public void turnOn() {};
            public void turnOff() {};
            public void setVolume(int volume) {};
        };
    }
}
