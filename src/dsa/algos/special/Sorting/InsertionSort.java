package dsa.algos.special.Sorting;
import java.util.Arrays;
public class InsertionSort {
    static void insertionSort(int [] arr){
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
            }
        }
        public static void main(String[] args){
        int[] arr = {5,8,9,-2,9,8,6};
            System.out.println(Arrays.toString(arr));
            insertionSort(arr);
            System.out.println(Arrays.toString(arr));
    }
}
