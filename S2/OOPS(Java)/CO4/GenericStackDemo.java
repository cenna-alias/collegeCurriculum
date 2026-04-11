class Stack<T> {
    private int size;
    private int top;
    private T[] arr;
    @SuppressWarnings("unchecked")
    Stack(int size) {
        this.size = size;
        this.top = -1;
        arr = (T[]) new Object[size];
    }
    public void push(T value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + arr[top--]);
        }
    }
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {

            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
public class GenericStackDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.pop();
        s.display();
    }
}
