package _thread1;
public class _Thread1 {

  
    public static void main(String[] args) {
        Worker w = new Worker();
        Thread t1 = new Thread(w);
        t1.start();
       
        Worker2 w2 = new Worker2();
        Thread t2 = new Thread(w2);
        t2.start();
    
        Worker3 w3 = new Worker3();
        Thread t3 = new Thread(w3);
        t3.start();
    }
    
}
