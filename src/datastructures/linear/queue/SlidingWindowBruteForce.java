package datastructures.linear.queue;

public class SlidingWindowBruteForce {
        public static void main(String[] args) {
            int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
            int k = 3;
            for (int i = 0; i <=arr.length - k; i++) {//0 to 8-3=5//i<arr.length-k--is the window size that is 6(0 to5)
                int max = arr[i];
                for (int j = i; j < i + k; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                    }
                }
                System.out.print(max + " ");
            }
        }
    }
/*
Total Windows Formula:n-k+1=>8-3+1=6
Total Windows=Total Length-WindowsSize+1
 */
