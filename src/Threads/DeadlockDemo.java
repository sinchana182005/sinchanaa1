package Threads;

public class DeadlockDemo{
    static final Object accountA = new Object();
    static final Object accountB = new Object();

    static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (accountA){
                System.out.println("Thread 1 locked Account A");
                try{
                    Thread.sleep(2000);
                }catch (Exception e){}
                synchronized (accountB){
                    System.out.println("Thread 2 locked Account B");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (accountB) {
                try{
                    Thread.sleep(2000);
                }catch (Exception e){}
                System.out.println("Thread 2 locked Account B");
                synchronized (accountA) {
                    System.out.println("Thread 1 locked Account A");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
/*
Thread - 1 acquires a lock on Account A and then sleeps,giving
Thread 2 to acquire a lock on Account B.Now,Thread 1 waits for
Account A and thread 2 waits for Account B. Since neither thread releases the lock.
both keep waiting and thus creating a deadlock❌
1.Deadlock explanation : Deadlock occurs when ech thread is holding a resource and waiting for other to release it.

 */