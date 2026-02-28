public class Test {
    @Deprecated// when code  is not used anymore
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");
    }
    public static void main(String[] args){
        Test t = new Test();
        t = null;
        for (int i = 1; i<100;i++){
            System.gc();
        }
    }
}
