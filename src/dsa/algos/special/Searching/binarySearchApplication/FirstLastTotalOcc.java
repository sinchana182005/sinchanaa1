package dsa.algos.special.Searching.binarySearchApplication;
import java.util.Arrays;
public class FirstLastTotalOcc {
    public static int firstOcc(int[] arr,int key){
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == key) {
                ans = mid;
                e = mid - 1;
            }else if(arr[mid] < key) {
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return ans;
    }
    public static int lastOcc (int[] arr,int key){
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == key) {
                ans = mid;
                s= mid + 1;
            }else if(arr[mid] < key) {
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return ans;
    }
    public static int totalOcc(int[] arr,int key){
        int fo = firstOcc(arr,key);
        int lo = lastOcc(arr,key);
        return lo - fo + 1;
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,5,6,7};
        int f = firstOcc(arr,3);
        int l = lastOcc(arr,3);
        int t = totalOcc(arr,3);
        System.out.println("First Occurance Index : " + f);
        System.out.println("Last Occurance Index : " +l);
        System.out.println("Total Occurance Index :" +t);
    }
}
