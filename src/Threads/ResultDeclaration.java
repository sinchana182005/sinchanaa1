package Threads;

public class ResultDeclaration{
    synchronized void declareResult() throws Exception{
        System.out.println("Waiting for approval");
        wait();
        System.out.println("Result Declaration");
    }
synchronized void approve(){
        notify();
}
    static void main(String[] args) throws Exception{
        ResultDeclaration rd = new ResultDeclaration();
        new Thread(
                () -> {
                    try {
                        rd.declareResult();
                    }catch (Exception e){}
                }).start();
        Thread.sleep(2000);
        new Thread(()->
            rd.approve()).start();
    }
}
/*
the declarationresult() method waits until another thread calls
notify().During wait(),the thread releases the lock ,allowing other threads to enter the synchronised code

->Points to remember
sleep() ->  time based
wait() -> condition based
wait() -> releases lock -> by the notify() method
wait() -> is used in inter threaded communication
Order-placed->Preparing->Prepared->Delivery->Delivered

 */
