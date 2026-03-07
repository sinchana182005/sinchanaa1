package dsa.algos.special.bitManipulations;

public class CheckKthBit {
    static void main(String[] args) {
        int n = 10;
        int k = 1;
        if((n & (1 << k))  != 0) {
            System.out.println("Bit is set");
        }else{
            System.out.println("Bit is not set");
        }
    }
}
