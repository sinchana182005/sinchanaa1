package datastructures.linear.queue;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGenerator {
    public static void generateBinaryNumbers1toN(int N) {
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        while (N-- > 0) {
            String curr = q.poll();
            System.out.print(curr + " ");
            q.offer(curr + "0");
            q.offer(curr + "1");
        }
        System.out.println();
    }

    static void main(String[] args) {
        int N = 5;
        generateBinaryNumbers1toN(N);
        generateBinaryNumbers1toN(6);
    }

        }

