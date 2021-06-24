package MultiThread;

import java.awt.*;

public class BeepPrintExample1 {
    public static void main(String[] args) {
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();

        for(int i = 0; i < 5; i++) {
            System.out.println("띵");
            try { Thread.sleep(1500); } catch(Exception e) {}
        }
    }
}
