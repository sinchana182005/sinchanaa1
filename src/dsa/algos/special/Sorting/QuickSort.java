package dsa.algos.special.Sorting;
import java.util.Arrays;
public class QuickSort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partitionIndex(int[] arr,int s, int e){
        int pivot = arr[s];
        int count = 0;
        for(int i=s+1;i<=e;i++){
            if(arr[i] < pivot) {
                count++;
            }
            }
        //Place the pivot at the correct position or index
        int pivotIndex = s + count;
        swap(arr, pivotIndex, s);
        //Lets manage the left and right side of the pivot
        int i = s,j = e;
        while(i<pivotIndex && j > pivotIndex) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivotIndex && j > pivotIndex) {
                swap(arr, i++, j--);
            }
        }
        return pivotIndex;
            }
            public static void quickSort(int[] arr,int s,int e) {
                //Base case //If single element or outOfBounds
                if (s >= e) {
                    return;
                }
                //Find the pivot for the parition of the array
                int p = partitionIndex(arr, s, e);
                //Now we use recursion to sort the LHS & RHS
                //Left part
                quickSort(arr, s, p - 1);
                //ryt part
                quickSort(arr, p + 1, e);
            }

    static void main(String[] args) {
        int[] arr = {8,4,6,7,9};
        int n = arr.length;
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
      }

