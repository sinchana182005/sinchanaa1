package dsa.algos.special.collections.lambdaExpressions;
interface Square {
    int calculate(int x);
}
public class Example3 {
    static void main(String[] args) {
        Square s = x -> x * x;
        System.out.println("Square :" +s.calculate(9));
    }
}

