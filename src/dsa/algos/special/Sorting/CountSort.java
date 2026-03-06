package dsa.algos.special.Sorting;
import java.util.Arrays;
public class CountSort {
public static void countSort(int[] arr){
    // s1 is find the max
    int k = arr[0];
    for(int i=1; i<arr.length;i++){
    if(arr[i] > k){
    k = arr[i];
    }
    }
    // s2 create a count array [0-max]
    int[] count = new int[k+1];
    //step 3 is calculate the frequency of each element in the array
    for(int i=0; i<arr.length;i++){
        count[arr[i]]++;
    }
    //step 4 is the calculate the cumulative frequency
    //skip index 0 and start from 1 till max (k)
    for(int i=1;i<=k;i++){
        //curr = curr + prev
        count[i] += count[i-1];
    }
    //step 5 is the create the output array
    int[] output = new int[arr.length];
    //Step 6 is the start from the end of the array (L <- R)
    for (int i = arr.length-1;i>=0;i--) {
        output[--count[arr[i]]] = arr[i];
    }
        System.arraycopy(output,0,arr,0,arr.length);

}
public static void main(String[] args){
    int[] arr = {4,4,5,5,1,2,3,};
    System.out.println(Arrays.toString(arr));
    CountSort.countSort(arr);
    System.out.println(Arrays.toString(arr));
}
}
