package Exceptions;
import java.io.IOException;
//for checked exception we use try-catch block
//the throws keyword doesnot handle the exception ,it is written in method signature(name)
// it only passes on the information to the calling method
//the calling method has to handle the exception using try catch

public class CheckException {
    static void readFile()throws IOException {
        throw new IOException("File not found!");
    }
    public static void main(String[] args){
        try {
            display();
        }catch (IOException e){
            System.out.println(e.getMessage());//used when we dont need io exception in output
        }
    }
    static void display() throws IOException {
        readFile();
    }

}
//fully qualified class name=java.io.IOException