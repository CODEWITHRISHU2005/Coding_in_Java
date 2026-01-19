/*
MIN_PRIORITY: Minimum priority that a thread can have. Value is 1.
NORM_PRIORITY: This is the default priority automatically assigned by JVM to a thread if a programmer does not explicitly set the priority of that thread. Value is 5.
MAX_PRIORITY: Maximum priority that a thread can have. Value is 10.
*/
class Thread_Priority extends Thread {
    public static void main(String args[]) {
        Thread_Priority t1 = new Thread_Priority();
        Thread_Priority t2 = new Thread_Priority();
        t1.setPriority(Thread.MIN_PRIORITY);  // setting priority of t1 thread to MIN_PRIORITY (1)
        t2.setPriority(Thread.MAX_PRIORITY);  // setting priority of t2 thread to MAX_PRIORITY (10)
        t1.start();
        t2.start();

    }

    public void run() {
        System.out.println("I'm thread : " + Thread.currentThread().getName());
        System.out.println("I'm thread :" + Thread.currentThread().getPriority());

    }
}   