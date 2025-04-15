class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class threadusingrunnable {
    // This class implements the Runnable interface
    // and overrides the run() method to define the thread's behavior.
    // The run() method is executed when the thread is started.
    // The main method creates two threads using the MyRunnable class.
    // Each thread will execute the run() method defined in MyRunnable.
    // The threads are started using the start() method, which invokes the run() method in a separate thread of execution.
    
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        
        thread1.start(); // Start the first thread
        thread2.start(); // Start the second thread
    }
}
