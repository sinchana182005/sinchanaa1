package Arrays;

public class E3 {
    static void main(String[] args) {
        //types
        int[] arr = {1, 2, 3, 4, 5};//1D
        // 2D Array -> Array of Arrays - Matrix
        int[][] matrix = {{1, 2, 3},//row 0
                {4, 5, 6},//row 1
                {7, 8, 9}};//row 2 [3x3] square matrix
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
//Jagged array
        //In a 2D array if the row length is not same
        int[][] jagged = {
                {1, 2, 3, 4, 5},
                {1, 2},
                {1}
        };
        System.out.println(jagged[0].length);
        System.out.println(jagged[1].length);
        System.out.println(jagged[2].length);
        //array.length = row | array[row].length = cols
        for (int r = 0; r < jagged.length; r++) {
            for (int c = 0; c < jagged[r].length; c++) {
                System.out.println(jagged[r][c] + "");
            }
            System.out.println();
        }
        for (int[] a : jagged) {
            for (int x : a) {
                System.out.println(x + "");
            }
            System.out.println();
        }
        char[][] names = {
                {'S', 'I', 'N', 'C', 'H'},
                {'B', 'R', 'U', 'N', 'O'}
        };
        for (char[] c : names) {
            for (char x : c) {
                System.out.println(x + "");
            }
            System.out.println();
        }
    }
}