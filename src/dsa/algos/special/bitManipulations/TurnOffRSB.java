package dsa.algos.special.bitManipulations;

public class TurnOffRSB {
    static void main(String[] args) {
        int n = 12;
        int result = n & (n-1);
        System.out.println("Result:" +result);

    }
}
