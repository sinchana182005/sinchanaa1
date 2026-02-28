package Threads;

public class SafeBankAccount {
    int balance=1000;
    synchronized void withdraw(int amount){
        balance -= amount;
    }
    static void main(String [] args) throws  InterruptedException{
        SafeBankAccount acc = new SafeBankAccount();
        Thread t1 = new Thread(() -> acc.withdraw(500));
        Thread t2 = new Thread(() -> acc.withdraw(500));
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final Balance:" + acc.balance);
    }
}
/*
both the threads t1 and t2 access and modify the same balance variable
simultaneously. Due to lack of synchronisation,the final balance becomes inconsistent.
Points to remember
1.Shared data causes issues
2.Execution order is unpredictable
3.leads to data inconsistency
 4.need synchronisation to solve RACE CONDITION
 */
/* code explanation
the synchronised keyword ensures that only one thread can execute the withdraw() operation
at a tym,preventing race condition and ensuring correct balance deduction.

Points to remember
>Synchronisation avoids race condition
>looks critical section in an appln
>slower but safe
>it is essential for shared resources

 */