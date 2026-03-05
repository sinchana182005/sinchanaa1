package dsa.algos.special.Sorting;
import java.util.Arrays;


public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }

    static void main(String[] args) {
        int[] arr = {9,3,4,5,5,6};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        }
    }


