package dsa.algos.special.collections.sets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicatesFromAnArray {
public static void main(String[] args){
    int[] arr = {1,1,2,3,3,4,5,5,6};
    System.out.println(Arrays.toString(arr));
    Set<Integer> uniqueElements = new HashSet<>();
    for(int x : arr) {
        uniqueElements.add(x);
    }
    System.out.println(uniqueElements);
    Set<Integer> nonDuplicates = new HashSet<>();
    nonDuplicates.addAll(Arrays.asList(1,2,3,4,5,6,1,2,2,3,3));
    System.out.println(nonDuplicates);
    }
}









