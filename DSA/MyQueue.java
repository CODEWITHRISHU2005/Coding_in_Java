
public class MyQueue {

    private int front = 0;
    private int rear = -1;
    private int size = 0;
    private static int arr[] = new int[5];

    public void add(int data) {
        if (size == arr.length) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = data;
        size++;
    }

    public int remove() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return data;
    }

    public int peek() {
        return arr[front];
    }

    public void printQueue() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % arr.length] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q.remove());
        System.out.println(q.peek());
        q.printQueue();
    }
}
