package Threads;

public class SleepExample {
    static void main(String[] args) throws InterruptedException{
        System.out.println("Printing 0-9");
        for(int i =0;i<10;i++) {
            System.out.println("Printed:" + i);
            Thread.sleep(2000);
        }
        System.out.println("Done");

    }
}
/*
here the thread is paused for a fixed duration of tym
the thread doesnt lock anything lack anything and resumes after the given tym
 */