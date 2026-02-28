package Arrays;
import java.util.Arrays;

public class E5 {
    static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[arr1.length];
        System.out.println(Arrays.toString(arr2));
 for(int i = 0;i<arr1.length;i++){
     arr2[i] = arr1[i];
 }
        System.out.println(Arrays.toString(arr2));
    int[] arr3 = new int[arr2.length];
    //arraycopy(src,s_pos,des,des_pos,len)
    System.arraycopy(arr2,0,arr3,0,arr2.length);
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = arr3.clone();
        System.out.println(Arrays.toString(arr4));

    }
}
