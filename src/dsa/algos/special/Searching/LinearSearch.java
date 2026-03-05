package dsa.algos.special.Searching;

public class LinearSearch {
    static int linearSearch(int[] arr, int target){
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i] == target){
                return i;

            }
        }
        return -1;
    }

    static void main(String[] args) {
        int[] arr = {10,52,0,8,1,5};
        System.out.println(linearSearch(arr,80));
        System.out.println(linearSearch(arr,90));
    }
}
