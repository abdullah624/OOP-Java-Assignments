package javaapplication6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Synchronization extends Thread {
    public static void main(String[] args) {
        Synchronization ob1 = new Synchronization();
        Synchronization ob2 = new Synchronization();
        ob1.start();
        ob2.start();
    }
    
    static synchronized void print(){
        for(int i=1; i<=10; i++){
            try {
                System.out.println(i);
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Synchronization.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public void run(){
        synchronized (this){
        print();
        }
    }
}
