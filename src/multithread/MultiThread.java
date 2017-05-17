/*
 *  Developed by Abdulmuaz Alshaikhli
 * Slmnshukur1993@gmail.com
 * Student Easj.dk 2017. 
 MIT Licensed.
 */
package multithread;

/**
 *
 * @author slmns
 */
public class MultiThread implements Runnable { //Thread{
public void run(){
    System.out.println("Thread is running....");
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//  MultiThread t1 = new MultiThread();
//  t1.start();
MultiThread m1 = new MultiThread();
Thread t2 = new Thread(m1);
t2.start();
    }
    
}
