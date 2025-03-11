public class Q4 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 with priority " + Thread.currentThread().getPriority());
        });
        
        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 with priority " + Thread.currentThread().getPriority());
        });
        
        Thread thread3 = new Thread(() -> {
            System.out.println("Thread 3 with priority " + Thread.currentThread().getPriority());
        });
        
        thread1.setPriority(Thread.MIN_PRIORITY); 
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY); 
        
        thread1.start();
        thread2.start();
        thread3.start();
    }
}