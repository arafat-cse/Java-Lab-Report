public class ArrayStack implements StackADT {
    private int[] stack;
    private int top;
    private int capacity;
    // Constructor
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1; 
    }
    @Override
    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack is full. Cannot push.");
        } else {
            stack[++top] = element;
        }
    }
    @Override
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; 
        } else {
            return stack[top--];
        }
    }
    @Override
    public int size() {
        return top + 1;
    }
    public void printStack() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
