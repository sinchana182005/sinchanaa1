package Exceptions;

public class E1 {
    public static void main(String[] args) {
        int i, j, k = 0;
        i = 10;
        j = 10;
        try {
            k = i / j;
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[9]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
            e.printStackTrace();//Details
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
            //till here it belongs to one class
        } catch (Exception e) {
            System.out.println("Something unexpected happened");
        }finally{
            System.out.println("Shutdown all");
        }
        System.out.println("The value of k is " + k);
    }

    static {
        System.out.println("Start Execution");
        System.out.println("Load DB");
        System.out.println("Load Internet");
        System.out.println("Load Files");
        System.out.println("Something unexpected happened");
    }

}

