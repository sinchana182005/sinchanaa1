package Exceptions;

public class ThrowableDemo {
    static void test() throws Throwable{
        throw new Throwable("Something went wrong!");
    }
    public static void main(String[] args){
        try {
            test();
        }catch (Throwable t){
            System.out.println("Handled:"+t);
            System.out.println("Handled:"+t.getMessage());
        }
    }
}
//throw new String("error") are wrong
//throw new Integer("error") are wrong
//throw new throwable,new Exception,new RuntimeException,new Io exception("Error) are ryt