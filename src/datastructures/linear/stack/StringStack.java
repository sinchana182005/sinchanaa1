package datastructures.linear.stack;
import java.util.Arrays;

public class StringStack {
    private static final int MAX_SIZE=10;
    private String[]arr=new String[MAX_SIZE];
    private int top=-1;//Stack is initially empty
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==MAX_SIZE-1;
    }
    public void push(String data){
        if(isFull()){
            System.out.println("Stack Overflow,Can't add more elements.");
            return;
        }
        arr[++top]=data;//preincrement
        System.out.println("The String:"+ data +" was pushed to the stack.");
    }
    public String pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow.Can't remove the top.");
            return null;
        }
        String popped=arr[top--];
        return popped;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack Underflow.No elements to display.");
            return;
        }
        System.out.println("The Stack elements order[LIFO]are:");
        for(int i=top;i>=0;i--){//top =index here
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public int size(){
        return top+1;
    }
    public String peek(){
        //Intention is to fetch the top element->not delete it
        if(isEmpty()){
            System.out.println("Stack Underflow.Can't retrieve top.");
            return null;
        }
        return arr[top];
    }
    public static void main(String[] args) {
        StringStack stack=new StringStack();
        //stack.pop();
        stack.push("Mango");
        stack.push("Strawberry");
        stack.push("Avocado");
        stack.display();
        System.out.println("Top Element:"+stack.peek());
        String popped=stack.pop();
        System.out.println("Popped element is:"+popped);
        stack.display();
        System.out.println("Size of Stack:"+stack.size());
    }
}
