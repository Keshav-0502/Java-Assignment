public class Q10 {
    private volatile boolean running = true;
    
    public void stopThread() {
        running = false;
    }
    
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (!running) {
                System.out.println("Thread stopped at " + i);
                break;
            }
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        Q10 stoppable = new Q10();
        
        Thread thread = new Thread(() -> {
            stoppable.run();
        });
        
        thread.start();
        
        try {
            Thread.sleep(2000); // Let the thread run for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        stoppable.stopThread();
        System.out.println("Main thread sent stop signal");
    }
}