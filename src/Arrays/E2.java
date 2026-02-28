package Arrays;

public class E2 {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[1]);
        arr[1]=40;
        System.out.println(arr[1]);
        //Access and update the elements in the array -> TC 0(1)
        //This is because of index based access or
        //direct index mapping
        //[index = pos - 1] or [pos = index + 1]
    for(int i = 0; i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
        System.out.println();
    for(int x : arr){
        System.out.print(x + "");
    }
        System.out.println();
    for(Object o : arr){
        System.out.print(o + "");
    }
        System.out.println();
    String name = "Java";
        System.out.println(name.length());

    }
}
/* arr.length is a property
string.length() is a method
Memory Management
-> Array Objects is stored in a heap
-> Variable reference is stored in a stack
-> Elements are stored in a contiguous memory blocks
->char[1][1][1][1] int[4][4][4][4] double[8][8][8][8] bytes

 */