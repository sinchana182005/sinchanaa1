package datastructures.linear.stack;

public class IntegerStack {
    int arr[];
    int top;
    int capacity;
    IntegerStack(int size) {
        capacity = size;
        arr = new int[size];
        top = -1;
    }
    void push(int x){
        if(top == capacity-1){
            System.out.println("Stack Overflow.");
            return;
        }
        arr[++top] = x;
        System.out.println("Added"+x+"to the top of the stack.");
    }
    int pop(){
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top--];
        }
void display(){
        if (top == -1){
            System.out.println("Stack Overflow.Nothing to display");
            return;
        }
        for(int i = top;i>=0;i--){
            System.out.println(arr[i] + " ");
        }
    System.out.println();
}

    static void main(String[] args) {
        IntegerStack stack = new IntegerStack(5);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Popped:" +stack.pop());
        stack.display();
    }
}
