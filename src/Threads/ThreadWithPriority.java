package Threads;

public class ThreadWithPriority  extends Thread{
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " | Priority:" + Thread.currentThread().getPriority());
        }
    }
    public static void main(String[] args) {
        ThreadWithPriority t1 = new ThreadWithPriority();
        ThreadWithPriority t2 = new ThreadWithPriority();
        ThreadWithPriority t3 = new ThreadWithPriority();
        t1.setName("Low Priority Name");
        t2.setName("Medium Priority Name");
        t3.setName("High Priority Name");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        //t3.setPriority(11);IllegalArguementException
        t1.start();
        t2.start();
        t3.start();
    }
    }
    /* Points to remember
1.Thread Priority is only a suggestion to the JVM or the Scheduler.
2.Higher priority doesn't guarantee execution order.
3.Highest priority threads may get more CPU scheduler time.
4.The actual behaviour depends on JVm and operating System

     */