import java.util.LinkedList;
import java.util.Queue;
public class Q9 {
    private static final int BUFFER_SIZE = 5;
    private final Queue<Integer> buffer = new LinkedList<>();
    private final Object lock = new Object();
    
    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (lock) {
                while (buffer.size() == BUFFER_SIZE) {
                    System.out.println("Buffer is full, producer waiting...");
                    lock.wait();
                }
                
                value++;
                buffer.add(value);
                System.out.println("Produced: " + value);
                
                lock.notify();
                Thread.sleep(1000);
            }
        }
    }
    
    public void consume() throws InterruptedException {
        while (true) {
            synchronized (lock) {
                while (buffer.isEmpty()) {
                    System.out.println("Buffer is empty, consumer waiting...");
                    lock.wait();
                }
                
                int value = buffer.poll();
                System.out.println("Consumed: " + value);
                
                lock.notify();
                Thread.sleep(1000);
            }
        }
    }
    
    public static void main(String[] args) {
        Q9 example = new Q9();
        
        Thread producerThread = new Thread(() -> {
            try {
                example.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        Thread consumerThread = new Thread(() -> {
            try {
                example.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        producerThread.start();
        consumerThread.start();
    }
}