package dsa.algos.special.bitManipulations;

import java.util.Scanner;

public class PowerOfTwo {
    static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if((n & (n-1)) == 0){
                System.out.println(n+" POWER of 2");
            }else{
                System.out.println(n+" NOT POWER of 2");
            }
        }
    }

