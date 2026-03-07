package dsa.algos.special.bitManipulations;

public class SetKthBit {
    static void main(String[] args) {
        int n = 10;
        int k = 0;
        int result = n | (1 << k);
        System.out.println("Result :" + result);
    }
}
