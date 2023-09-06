package _thread1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Worker2 implements Runnable{
    public void run(){
        for(int x=1;x<10;x++){
            System.out.println("Worker2 hello" +x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Worker2.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
}
