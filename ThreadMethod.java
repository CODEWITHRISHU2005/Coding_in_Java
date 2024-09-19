/*
=> Sleep() Method :
-> The sleep() method in Java is useful to put a thread to sleep for a specified amount of time.
-> When we put a thread to sleep, the thread scheduler picks and executes another thread in the queue.
-> Sleep() method returns void.
-> Sleep() method can be used for any thread, including the main() thread also.

=> Interrupt() method :
-> A thread in a sleeping or waiting state can be interrupted by another thread with the help of the interrupt() method of the Thread class.
-> The interrupt() method throws InterruptedException.
-> The interrupt() method will not throw the InterruptedException if the thread is not in the sleeping/blocked state, but the interrupt flag will be changed to true.

=> Join() method In Java :
-> The join() method in Java allows one thread to wait until the execution of some other specified thread is completed.
-> If t is a Thread object whose thread is currently executing, then t.join() causes the current thread to pause execution until t's thread terminates.
-> Join() method puts the current thread on wait until the thread on which it is called is dead.
*/
class Thr1 extends Thread {
    public void run() {
        int i = 0;
        while (true) {
//            System.out.println("I am a thread");
            System.out.println("Thank you: ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class Thr2 extends Thread {

    public void run() {
        while (true) {
//            System.out.println("I am a thread");
            System.out.println("My Thank you: ");
        }
    }
}

public class ThreadMethod {
    public static void main(String[] args) {
        Thr1 t1 = new Thr1();
        Thr2 t2 = new Thr2();
        t1.start();
//        try{
//            t1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }

        t2.start();

    }
}
