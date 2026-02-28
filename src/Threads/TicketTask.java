package Threads;

public class TicketTask implements Runnable{
    String task;
    TicketTask(String task){
        this.task = task;
    }
    public void run(){
        System.out.println(task + "in progress");
    }
    public static void main(String[] args){
        Thread t1 = new Thread(new TicketTask("Seat Assignment"));
        Thread t2 = new Thread(new TicketTask("Payment Process"));
        Thread t3 = new Thread(new TicketTask("SMS Notification"));
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
Each runnable object is a job,and the thread class is responsible
only for execution,which makes this approach clean and flexible
->implements runnable
->Better design
->Interviewers mostly ask this
->supports multiple inheritance via interface
 */
