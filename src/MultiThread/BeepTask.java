package MultiThread;

import java.awt.*;

public class BeepTask implements Runnable {
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i < 5; i++) {
            toolkit.beep();
            try { Thread.sleep(1500); } catch(Exception e) {}
        }
    }
}
