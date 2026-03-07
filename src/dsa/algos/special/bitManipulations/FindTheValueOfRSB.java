package dsa.algos.special.bitManipulations;

public class FindTheValueOfRSB {
    static void main(String[] args) {
        int n = 12; //1100 = 4
        int result = n & -n;
        System.out.println("Rightmost set bit value " +result);
        System.out.println();

    }
}
