package Exceptions;

public class Demo {
    public static void main(String[] args) {
    try {
        int balance = 2000;
        int withdraw = 3000;
        if (withdraw > balance) {
            throw new ArithmeticException("Insufficient Balance");
        } else {
            System.out.println("Withdrawal Successful");
        }
        System.out.println("Withdraw  Successful");
    }catch (ArithmeticException e){
        System.out.println("Caught Exception:"+e.getMessage());

    }
    }
}