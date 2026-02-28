package Threads;

public class ATMTransaction extends Thread {
    public void run(){
        System.out.println("Processing ATM Transaction");
    }
    public static void main(String[] args){
        ATMTransaction t = new ATMTransaction();
        System.out.println("Thread State: " +t.getState());
        t.start();
        System.out.println("Thread state after start:" +t.getState());//Runnable

    }
}
/* code explanation
//Initially the thread is in the new state.After calling start(),it moves to RUNNABLE and executes the run() method.
//The exact timing of the state changes depends on the JVM Scheduler
//Points to remember
//thread is created once
//start() changes state
//thread cannot be restarted
//final state is terminated or dead

 */
