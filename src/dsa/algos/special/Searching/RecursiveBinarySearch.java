package dsa.algos.special.Searching;

public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(int[] arr,int key,int s, int e){
        if(s > e) return -1;
        int mid = s + (e-s)/2;
        if(arr[mid] == key) return  mid;
        else if(arr[mid] < key)
            return recursiveBinarySearch(arr,key,mid+1,e);
        else
            return recursiveBinarySearch(arr,key,s,mid-1);
    }

    static void main(String[] args) {
        int[] arr = {2,4,5,6,7,45};
        int key = 123;
        int result = recursiveBinarySearch(arr,key,0,arr.length-1);
        System.out.println("Element :" +key + "found at index:" +result);
    }
}
