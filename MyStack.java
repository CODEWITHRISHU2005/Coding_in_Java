public class MyStack {
    private static int arr[] = new int[5];
    int top, size;

    public MyStack() {
        size = arr.length;
        top = -1;
    }

    public void push(int data) {
        if (top < size)
            arr[++top] = data;
        else System.out.println("Stack Overflow");
    }

    public int pop() {
        if (top > -1)
            return arr[top--];
        else {
            System.out.println("Stack Underflow");
        }
        return -1;
    }

    public int peek() {
        return arr[top];
    }

    public void printStack() {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyStack nums = new MyStack();
        nums.push(10);
        nums.push(20);
        System.out.println(nums.pop());
        nums.push(30);
        nums.push(40);
        System.out.println(nums.peek());
        nums.push(50);
        nums.printStack();
    }
}