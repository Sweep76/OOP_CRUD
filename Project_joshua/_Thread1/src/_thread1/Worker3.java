package _thread1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Worker3 implements Runnable{
    public void run(){
        for(int x=1;x<10;x++){
            System.out.println("Worker3 hola" +x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Worker3.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
}
