package Threads;

public class JoinProof {
    static class Task extends Thread {
        public void run(){
            try {
                Thread.sleep(2000);
            }catch (Exception e){}
                System.out.println("Task Finished");
        }
    }
    public static void main(String [] args)throws InterruptedException{
        Task t = new Task();
        t.start(); //The main thread doesnt wait for this thread
        t.join();// the code will wait (guaranteed)
        System.out.println("Main Thread Resumes");
    }
}
