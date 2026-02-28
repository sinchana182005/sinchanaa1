package Arrays;

public class E4 {
    static void printArray(int[]arr) {
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static int[] createArray(){
        return new int[]{10,20,30};
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray(arr);
        int[] result = createArray();
        for(int num : result){
            System.out.print(num + " ");
        }
        System.out.println();
        printArray(new int[]{100,200,200});
    }
}
