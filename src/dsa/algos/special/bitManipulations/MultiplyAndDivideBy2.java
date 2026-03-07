package dsa.algos.special.bitManipulations;

public class MultiplyAndDivideBy2 {
    static void main(String[] args) {
        int n = 5;  //0101 << 1 = 1010
        int result = n << 1; //Multiplied by 2
        System.out.println("Result :" +result);
        int x = 50;
        int res = n >> 1; //Divided by 2
        System.out.println("Res:" + res);
    }
}
