package dsa.algos.special.Searching.binarySearchApplication;

public class SquareRootBinarySearch {
    public static int sqrt_bs(int n) {
        int s = 0;
        int e = n;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int square = mid * mid;
            if (square == n) {
                return mid;
            } else if (square > n) {
                e = mid + 1;
            } else {
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }

    static void main(String[] args) {
        System.out.println(sqrt_bs(36));
        System.out.println(sqrt_bs(37));
    }
    }

