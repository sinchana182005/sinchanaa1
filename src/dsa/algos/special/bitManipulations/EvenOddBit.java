package dsa.algos.special.bitManipulations;
import java.util.Scanner;
public class EvenOddBit {
    static void main(String[] args) {
        int n ;
        Scanner scanner = new Scanner (System.in);
        n = scanner.nextInt();

        if((n & 1) == 0) {
            System.out.println(n + " is Even");
        }else {
                System.out.println(n + " is Odd");

            }

        }
    }

