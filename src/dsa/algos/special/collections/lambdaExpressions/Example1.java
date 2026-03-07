package dsa.algos.special.collections.lambdaExpressions;

public class Example1 {
    static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("Thread is running using Labda(->)");
        };
        Thread t = new Thread(r);
        t.start();
        }
    }
