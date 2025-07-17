
public class MyStack {

    protected int arr[];
    protected int top;
    public static final int DEFAULT_CAPACITY = 5;

    public MyStack() throws Exception {
        arr = new int[DEFAULT_CAPACITY];
        top = -1;
    }

    public MyStack(int capacity) throws Exception {
        if (capacity < 1) {
            throw new Exception("Invalid Stack Capacity");
        }
        arr = new int[capacity];
        top = -1;
    }

    public void push(int data) throws Exception {
        if (size() == arr.length) {
            throw new Exception("Stack Overflow");
        }
        arr[++top] = data;
    }

    public int pop() throws Exception {
        if (size() == 0) {
            throw new Exception("Stack Underflow");
        }
        return arr[top--];
    }

    public int peek() {
        return arr[top];
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        MyStack nums = new DynamicStack();
        nums.push(10);
        nums.push(20);
        System.out.println(nums.pop());
        nums.push(30);
        nums.push(40);
        System.out.println(nums.peek());
        nums.push(50);
        nums.push(60);
        nums.push(70);
        nums.printStack();
    }
}

class DynamicStack extends MyStack {

    //Array_List or Linked_List
    public DynamicStack() throws Exception {
        this(DEFAULT_CAPACITY);
    }

    public DynamicStack(int capacity) throws Exception {
        super(capacity);
    }

    @Override
    public void push(int data) {
        if (size() == this.arr.length) {
            int temp[] = new int[2 * this.arr.length];
            for (int i = 0; i < this.arr.length; i++) {
                temp[i] = this.arr[i];
            }
            this.arr = temp;
        }
        try {
            super.push(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
