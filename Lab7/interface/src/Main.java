public class Main {
    public static void main(String[] args) {
        ArrayStack myStack = new ArrayStack(5);

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.printStack(); 
        System.out.println("Popped: " + myStack.pop()); 
        myStack.printStack(); 
        System.out.println("Size: " + myStack.size()); 
    }
}
