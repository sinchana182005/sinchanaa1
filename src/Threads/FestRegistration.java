package Threads;

public class FestRegistration {
    static class FormFilling extends Thread {
        public void run(){
            System.out.println("Form Filling Started!");
        }
    }
    static class DocumentsUpload extends Thread {
        public void run(){
            System.out.println("Document Upload Started!");
        }
    }
    static class EmailNotification extends Thread {
        public void run() {
            System.out.println("Confirm email sent");
        }
    }

    static void main(String [] args) {
            FormFilling t1 = new FormFilling();
            DocumentsUpload t2 = new DocumentsUpload();
            EmailNotification t3 = new EmailNotification();
            t1.start();
            t2.start();
            t3.start();
            //output order doesnot remain same it depends on the jvm
        }
    }

    //Points to remember
//👍Java programs starts with one main method
//👍threads allow parallel execution /concurrency
//👍o/p order is not guaranteed
//👍Threads share the same memory
//👍improves perfomence and responsiveness
//👍when start() is called jvm creates a new thread
//👍 when run() is called directly there is no concurrency
/* Process vs thread
process is a running programme
thread : a path inside prog to execute prog
a process has its own memory
threads share same memory
creating thread is cheap than process
ex process chrome thread new tab of chrome
closing a tab will not close chrome or kill chrome
 */
